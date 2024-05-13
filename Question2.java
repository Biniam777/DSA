package package2;

public class Question2 {
	private int[] arr;
	private int top;

	public Question2(int size) {
		arr = new int[size];
		top = -1;
	}

	public void push(int value) {
		if (top == arr.length - 1) {
			System.out.println("Stack is full");
		} else {
			arr[++top] = value;
		}
	}

	public int pop() {
		if (top == -1) {
			System.out.println("Stack is empty");
			return -1;
		} else {
			return arr[top--];
		}
	}

	public int peek() {
		if (top == -1) {
			System.out.println("Stack is empty");
			return -1;
		} else {
			return arr[top];
		}
	}

	public boolean isEmpty() {
		return top == -1;
	}
}
