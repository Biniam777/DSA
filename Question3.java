package package3;

import package2.Question2;

public class Question3 {
	private Question2 stack1;
	private Question2 stack2;

	public Question3(int capacity) {
		stack1 = new Question2(capacity);
		stack2 = new Question2(capacity);
	}

	public void enqueue(int value) {
		stack1.push(value);
	}

	public int dequeue() {
		if (stack2.isEmpty()) {
			while (!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}
		return stack2.pop();
	}

	public int peek() {
		if (stack2.isEmpty()) {
			while (!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}
		return stack2.peek();
	}

	public boolean isEmpty() {
		return stack1.isEmpty() && stack2.isEmpty();
	}
}
