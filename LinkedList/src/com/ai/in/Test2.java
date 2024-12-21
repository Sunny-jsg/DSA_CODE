package com.ai.in;

import com.ai.in.LL.Node;

public class Test2 {
	public static void main(String[] args) {
		SLL list = new SLL();
		list.addFirst(444);
		list.addFirst(333);
		list.addFirst(222);
		list.addFirst(111);

		System.out.println(list.size);
		System.out.println(list.searching(333));
		list.printList();
		list.addLast(555);
		list.addLast(666);
		list.addLast(777);
		list.addLast(888);

		System.out.println(list.size);
		System.out.println(list.searching(666));
		System.out.println(list.searching(999));
		list.printList();

	}

}

class SLL {
	int size;
	Node head;

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
			size++;
		}
	}

	int getsize() {
		return this.size;
	}

	void addFirst(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}

	void addLast(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node currentNode = head;
		while (currentNode.next != null)
			currentNode = currentNode.next;
		currentNode.next = newNode;
	}

	boolean searching(int data) {
		Node currentNode = head;
		while (currentNode.next != null) {
			if (currentNode.data == data)
				return true;
			currentNode = currentNode.next;

		}
		return false;

	}

	void printList() {
		if (head == null) {
			System.out.println("List is Empty");
		}
		Node currentNode = head;
		while (currentNode != null) {
			System.out.print(currentNode.data + " =>");
			currentNode = currentNode.next;
		}
		System.out.println("null");
	}
}
/* OUTPUT
4
true
111 =>222 =>333 =>444 =>null
8
true
false
111 =>222 =>333 =>444 =>555 =>666 =>777 =>888 =>null
*/