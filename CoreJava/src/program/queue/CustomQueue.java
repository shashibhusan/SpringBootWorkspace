package program.queue;

public class CustomQueue {
	int front;
	int rear;
	int qa[];
	int size;
	int capacity;
	public CustomQueue(int capacity) {
		this.capacity = capacity;
		this.front = 0;
		this.rear = -1;
		this.qa = new int[capacity];
		this.size = 0;
	}

	public void add(int element) {
		if (isFull()) {
			throw new RuntimeException("Queue is full");
		} else {
			qa[++rear] = element;
			size++;
		}
	}

	public int peek() {
		return qa[front];
	}

	public int remove() {
		if (isEmpty()) {
			throw new RuntimeException("Queue is empty");
		} else {
			size--;
			return qa[front++];
		}
	}

	boolean isFull() {
		return rear == capacity - 1;
	}

	boolean isEmpty() {
		return size == 0;
	}

	int size() {
		return size;
	}

	public static void display(CustomQueue queue) {
		int r = queue.rear;
		for (int i = 0; i <= r; i++) {
			System.out.print(queue.qa[i] + " ");
		}
	}

	public static void main(String[] args) {
		CustomQueue customQueue = new CustomQueue(5);
		customQueue.add(3);
		customQueue.add(4);
		customQueue.add(5);
		customQueue.add(6);
		customQueue.add(7);
		display(customQueue);
	}

}
