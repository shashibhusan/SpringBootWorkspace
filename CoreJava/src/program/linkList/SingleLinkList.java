package program.linkList;

public class SingleLinkList {

	public Node head = null;
	public Node tail = null;

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void addNode(SingleLinkList linkList, int data) {
		Node newNode = new Node(data);
		if (linkList.head == null) {
			linkList.head = newNode;
			linkList.tail = newNode;
		} else {
			linkList.tail.next = newNode;
			linkList.tail = newNode;
		}
	}

	public SingleLinkList deleteNode(SingleLinkList linkList, int key) {
		Node currentNode = linkList.head;
		Node previousNode = null;
		Node nextNode = null;
		if (currentNode.data == key) {
			linkList.head = currentNode.next;
		} else {
			while (currentNode.next != null) {
				previousNode = currentNode;
				currentNode = currentNode.next;
				nextNode = currentNode.next;
				if (currentNode.data == key) {
					previousNode.next = nextNode;
				}
			}
		}

		return linkList;
	}

	public void display(SingleLinkList linkList) {
		if (linkList.head == null) {
			System.out.println("LinkList is empty");
			return;
		} else {
			Node current = linkList.head;
			while (current != null) {
				System.out.print(current.data + " ");
				current = current.next;
			}
		}
	}

	public SingleLinkList createLoop(SingleLinkList linkList) {
		linkList.tail.next = linkList.head;
		return linkList;
	}

	public SingleLinkList reverseLinkList(SingleLinkList linkList) {
		Node previousNode = null;
		Node currentNode = linkList.head;
		Node nextNode;
		while (currentNode != null) {
			nextNode = currentNode.next;
			currentNode.next = previousNode;
			previousNode = currentNode;
			currentNode = nextNode;
		}
		linkList.head = previousNode;
		return linkList;
	}

	public SingleLinkList deleteWithIndex(SingleLinkList linkList, int index) {
		Node previousNode = null;
		Node currentNode = linkList.head;
		int i = 0;
		while (currentNode != null) {
			if (index == 0) {
				linkList.head = currentNode.next;
				return linkList;
			}else if(index==i) {
				previousNode.next = currentNode.next;
			}
			previousNode = currentNode;
			currentNode = currentNode.next;

			i++;
		}
		return linkList;
	}

	public static void main(String[] args) {

		SingleLinkList list = new SingleLinkList();
		SingleLinkList linkListOne = new SingleLinkList();
		for (int i = 1; i <= 10; i++) {
			list.addNode(linkListOne, i);
		}

		SingleLinkList linkListTwo = new SingleLinkList();
		for (int i = 1; i <= 10; i++) {
			list.addNode(linkListTwo, i);
		}

		SingleLinkList addofTwoLinkList = new SingleLinkList();

		Node current1 = linkListOne.head;
		Node current2 = linkListTwo.head;
		while (current1 != null & current2 != null) {
			int sum = current1.data + current2.data;
			list.addNode(addofTwoLinkList, sum);
			current1 = current1.next;
			current2 = current2.next;
		}

		list.display(addofTwoLinkList);

		System.out.println("\n");

		SingleLinkList result = list.deleteNode(addofTwoLinkList, 20);
		list.display(list.reverseLinkList(result));

		System.out.println("\n");
		SingleLinkList indexResult = list.deleteWithIndex(addofTwoLinkList, 2);
		list.display(indexResult);

		System.out.println("\n  ======Finding loop in LinkedList========");

		SingleLinkList ll = new SingleLinkList();
		for (int i = 1; i <= 10; i++) {
			list.addNode(ll, i);
		}
		SingleLinkList res = list.createLoop(ll);

		System.out.println("==== " + res.tail.next.data);

		Node first = res.head;
		Node second = res.head;

		while (first != null && second != null) {

			// move first reference by 2 nodes
			first = first.next.next;

			// move second reference by 1 node

			second = second.next;

			// if two references meet
			// then there is a loop
			if (first == second) {
				System.out.println("There is loop");
			}
		}
	}

}
