package ArrayList;

public class MyArrayDeque<T> {
	int capacity = 5;
	int queue[] = new int[capacity];
	int front;
	int rear;
	int size;

	public void add(int data) {
		if (size == capacity) {
			expand();
		}
		queue[rear] = data;
		rear++;
		size++;
	}

	public int remove() {

		if (size <= (capacity) / 4) {
			shrink();
		}
		int temp = queue[front];
		// queue[front]=(Integer) null;
		front++;
		size--;
		return temp;
	}

	public void show() {
		System.out.println("Elements in Queue:");
		for (int i : queue) {
			System.out.print(i + " ");
		}
	}

	private void expand() {
		capacity = capacity * 2;
		int lenght = size;
		int newQueue[] = new int[capacity];
		System.arraycopy(queue, 0, newQueue, 0, lenght);
		queue = newQueue;
	}

	private void shrink() {
		capacity = capacity / 2;
		int length = size;
		int newQueue[] = new int[capacity];
		System.arraycopy(queue, 0, newQueue, 0, length);
		queue = newQueue;
	}

}
