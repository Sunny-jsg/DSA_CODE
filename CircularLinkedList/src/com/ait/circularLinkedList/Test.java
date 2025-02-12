package com.ait.circularLinkedList;

public class Test {
	public static void main(String[] args) {
		CSLL list = new CSLL();
		list.addHead(555);
		list.addHead(444);
		list.addHead(333);
		list.addHead(222);
		list.addHead(111);
		list.addTail(666);
		
		list.print();
		list.addPos(3, 999);
		list.print();
		list.removeHead();
		list.print();
		list.removeTail();
		list.print();
		System.out.println(list.search(444));
	}

}

class CSLL {
	Node tail;
	int size;

	class Node {
		int value;
		Node next;

		Node(int value, Node next) {
			this.value = value;
			this.next = next;

		}

	}

	void print() {
		if (size == 0) {
			System.out.println("CSLL is empty ...............");
			return;
		}
		Node temp = tail.next;
		while (temp != tail) {
			System.out.print(temp.value + " => ");
			temp = temp.next;
		}
		System.out.println(temp.value);
	}

	void addHead(int value) {
		Node newNode = new Node(value, null);
		if (size == 0) {
			tail = newNode;
			newNode.next = newNode;
		} else {
			newNode.next = tail.next;
			tail.next = newNode;
		}
		size++;
	}

	void addTail(int value) {
		Node newNode = new Node(value, null);
		if (size == 0) {
			tail = newNode;
			newNode.next = newNode;
		} else {
			newNode.next = tail.next;
			tail.next = newNode;
			tail = newNode;

		}
		size++;

	}

	void addPos(int pos, int value) {
		Node newNode = new Node(value, null);
		if (size == 0) {
			tail = newNode;
			newNode.next = newNode;
		} else {
			if (pos == 0) {
				Node temp = tail.next;
				newNode.next = temp;
				tail.next = newNode;
				return;
			}
			Node temp = tail.next;
			int i = 0;
			while (temp.next != tail && i < pos - 1) {
				temp = temp.next;
				i++;
			}
			newNode.next = temp.next;
			temp.next = newNode;
		}
		size++;
	}

	void removeHead() {
		if (size == 0) {
			System.out.println("CSLL is empty");
			return;
		}
		if (tail == tail.next)
			tail = null;
		else
			tail.next = tail.next.next;
		size--;
	}

	void removeTail() {
		if (size == 0) {
			System.out.println("CSLL is empty");
			return;
		}
		if (tail == tail.next)
			tail = null;
		else {
			Node temp = tail.next;
			while (temp.next != tail) {
				temp = temp.next;
			}
			temp.next = tail.next;
			tail = temp;
		}
		size--;
	}

	void deleteElement(int value) {
		if (size == 0) {
			System.out.println("CSLL is empty");
			return;
		}
		Node prev = tail, currNode = tail.next, head = tail.next;
		if (currNode.value == value) {
			if (currNode == currNode.next)
				tail = null;
			else
				tail.next = tail.next.next;
			return;
		}
		prev = currNode;
		currNode = currNode.next;
		while (currNode != head) {
			if (currNode.value == value) {
				if (currNode == tail)
					tail = prev;
				prev.next = currNode.next;
				return;
			}
			prev = currNode;
			currNode = currNode.next;
		}
		return;
	}

	boolean search(int value) {
		Node temp = tail;
		for (int i = 0; i < size; i++) {
			if (temp.value == value)
				return true;
			temp = temp.next;
		}
		return false;
	}
}