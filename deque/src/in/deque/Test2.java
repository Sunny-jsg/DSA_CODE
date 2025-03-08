package in.deque;

public class Test2 {
	public static void main(String[] args) {
		DequeList dq = new DequeList();
		dq.insertAtFront(333);
		dq.insertAtFront(222);
		dq.insertAtFront(111);
		dq.display();// 111 222 333
		dq.insertAtRear(444);
		dq.insertAtRear(555);
		dq.insertAtFront(999);
		dq.display();// 999 111 222 333 444 555
		dq.deleteAtFront();
		dq.display();// 111 222 333 444 555
		dq.deleteAtRear();
		dq.display();// 111 222 333 444

	}

}

class DequeList {
	Node front, rear;
	int size;// number of element in deque

	DequeList() {
		front = null;
		rear = null;
		size = 0;
	}

	class Node {
		int data;
		Node next;

		Node(int data, Node next) {
			this.data = data;
			this.next = next;
			size++;
		}
	}

	void insertAtFront(int value) {
		Node newNode = new Node(value, null);
		if (front == null) {
			front = newNode;
			rear = newNode;
			return;
		}
		newNode.next = front;
		front = newNode;
	}

	void insertAtRear(int value) {
		Node newNode = new Node(value, null);
		if (front == null) {
			front = newNode;
			rear = newNode;
			return;
		}
		rear.next = newNode;
		rear = newNode;
	}

	void deleteAtFront() {
		if (front == null) {
			System.out.println("dq is empty");
			return;
		}
		System.out.println("deleted obj is: " + front.data);
		front = front.next;
		size--;
	}

	void deleteAtRear() {
		if (front == null) {
			System.out.println("dq is empty");
			return;
		}
		System.out.println("deleted obj is: " + rear.data);
		size--;
		if (front == rear) {
			front = null;
			rear = null;
			return;
		}
		Node temp = front;
		while (temp.next != rear)
			temp = temp.next;
		rear = temp;
		rear.next = null;
	}

	void display() {
		if (front == null) {
			System.out.println("dq is empty");
			return;
		}
		Node temp = front;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

}
