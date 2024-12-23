package com.ai.in;

import java.util.*;

public class Test4 {
	public static void main(String[] args) {
		SLL3 list1 = new SLL3();
		list1.addFirst(333);
		list1.addFirst(222);
		list1.addFirst(111);

		list1.printList();
		list1.addLast(444);
		list1.addLast(555);
		list1.printList();
		list1.deleteFirst();
		list1.printList();
		list1.deleteLAst();
		list1.printList();
		list1.deleteElement(333);
		list1.printList();
	}

}

class SLL3 {
	int size;
	Node head;

	class Node {
		int data;
		Node Next;

		Node(int data) {
			this.data = data;
			this.Next = null;
			size++;
		}
	}

	int getSize() {
		return this.size;
	}

	void addFirst(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		newNode.Next = head;
		head = newNode;

	}

	void addLast(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node currentNode = head;
		while (currentNode.Next != null)
			currentNode = currentNode.Next;
		currentNode.Next = newNode;

	}

	void deleteFirst() {
		if (head == null) {
			System.out.println("List is Empty");
			return;
		}
		size--;
		head = head.Next;
	}

	void deleteLAst() {
		if (head == null) {
			System.out.println("List is Empty");
			return;
		}
		if (head.Next == null) {
			head = null;
			return;

		}
		size--;
		Node temp1, temp2;
		temp1 = head;
		temp2 = head.Next;
		while (temp2.Next != null) {
			temp2 = temp2.Next;
			temp1 = temp1.Next;
		}
		temp1.Next = null;
	}

	void deleteElement(int data) {
		Node temp = head;
		if (temp == null) {
			System.out.println("empty");
			return;
		}
		if (temp.data == data) {
			head = head.Next;
			return;
		}
		while (temp.Next != null) {
			if (temp.data == data) {
				temp.Next = temp.Next.Next;
				size--;
				return;
			}
			temp = temp.Next;

		}
	}

	void printList() {
		if (head == null) {
			System.out.println("List is Empty");
			return;
		}
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " =>");
			temp = temp.Next;
		}
		System.out.println("NULL");

	}
}
/* OUTPUT
111 =>222 =>333 =>NULL
111 =>222 =>333 =>444 =>555 =>NULL
222 =>333 =>444 =>555 =>NULL
222 =>333 =>444 =>NULL
222 =>333 =>NULL
*/