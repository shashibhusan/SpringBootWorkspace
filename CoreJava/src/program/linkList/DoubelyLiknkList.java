package program.linkList;

public class DoubelyLiknkList {

	Node head;
	Node tail;
	class Node {
		Node previousNode;
		int data;
		Node nextNode;

		public Node(int data) {
			this.previousNode = null;
			this.data = data;
			this.nextNode = null;
		}
	}

	private void addElement(DoubelyLiknkList linkList, int data) {
		Node node = new Node(data);
		if (linkList.head == null) {
			linkList.head = node;
			linkList.tail = node;
			linkList.head.previousNode = null;
			linkList.head.nextNode = null;
		} else {
			Node temp = linkList.tail;
			linkList.tail.nextNode = node;
			linkList.tail = node;
			linkList.tail.previousNode = temp;
		}
	}

	private void print(DoubelyLiknkList linkList) {
		if(linkList.head==null) {
			System.out.println("LinkList is empty");
		} else {
			Node currentNode = linkList.head;
			while (currentNode != null) {
				System.out.println(currentNode.data);
				currentNode = currentNode.nextNode;
			}
		}

	}

	private void printReverse(DoubelyLiknkList linkList) {
		if (linkList.tail == null) {
			System.out.println("LinkList is empty");
		} else {
			Node currentNode = linkList.tail;
			while (currentNode != null) {
				System.out.println(currentNode.data);
				currentNode = currentNode.previousNode;
			}
		}
	}

	public static void main(String[] args) {
		DoubelyLiknkList dl = new DoubelyLiknkList();
		DoubelyLiknkList linkList = new DoubelyLiknkList();
		for (int i = 0; i < 10; i++) {
			dl.addElement(linkList, i);
		}

		dl.print(linkList);
		// dl.printReverse(linkList);
	}

}
