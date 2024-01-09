package program.stack;

public class CustomStack {

	int maxSize;
	int a[];
	int top;
	int size;

	public CustomStack(int s) {
		this.maxSize = s;
		this.a = new int[s];
		this.top = -1;
		this.size = 0;
	}

	public void push(int element) {
		a[++top] = element;
		size++;
	}

	public int peek() {
		return a[top];
	}

	public int pop() {
		int p=a[top--];
		size--;
		return p;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == maxSize - 1;
	}

	public int size() {
		return size;
	}

	public static void display(CustomStack st) {
		int top = st.top;
		for (int i = top; i >= 0; i--) {
			System.out.print(st.a[i] + " ");
		}
	}

	public static void main(String[] args) {

		CustomStack customStack = new CustomStack(5);
		customStack.push(10);
		customStack.push(11);
		customStack.push(12);
		customStack.push(13);
		customStack.push(14);
		// Iterating the stack
		display(customStack);
	}

}
