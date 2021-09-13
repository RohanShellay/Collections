package Stack;

public class MyStack<T> {

	int capacity = 5;
	int stack[] = new int[capacity];
	int top = 0;

	public void puSh(int data) {
		if (siZe() == capacity) {
			expand();
		}

		stack[top] = data;
		top++;

	}

	private void expand() {
		int oldLength = siZe();
		int newStack[] = new int[capacity * 2];
		System.arraycopy(stack, 0, newStack, 0, oldLength);
		capacity = capacity * 2;
		stack = newStack;
	}

	public void shOw() {
		for (int i : stack) {
			System.out.print(" " + i);
		}
		System.out.println(" ");
	}

	public int poP() {
		int length = siZe();
		if (length <= (capacity / 4)) {
			shRink();
		}
		top--;
		int data = stack[top];
		stack[top] = 0;
		return data;
	}

	private void shRink() {
		capacity = capacity / 2;
		int newStack[] = new int[capacity];
		int oldLenght = siZe();
		System.arraycopy(stack, 0, newStack, 0, oldLenght);
		stack = newStack;
	}

	public void peEk() {
		top--;
		int data = stack[top];
		System.out.println(data);
	}

	public int siZe() {
		return top;

	}

}
