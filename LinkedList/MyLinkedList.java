package LinkedList;

public class MyLinkedList<T> {
	Node head;
	Node rear;

	public void insErt(T data) {
		Node node = new Node();
		node.data =  data;
		node.next = null;

		if (head == null) {
			head=node;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = (Node) temp.next;
			}
			temp.next = node;
		}
	}

	public void shOw() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = (Node) temp.next;
		}

	}

	public static class Node<T> {
		T data;
		T next;
	}
}
