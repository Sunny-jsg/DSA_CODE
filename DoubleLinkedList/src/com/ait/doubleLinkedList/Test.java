package com.ait.doubleLinkedList;

public class Test {
	public static void main(String[] args) {
		DLL list = new DLL();
		//list.addFirst(333);
		list.addFirst(222);
		list.addFirst(111);
		list.traverse();
		list.addLast(444);
		list.addLast(555);
		list.addLast(666);
		list.traverse();
		list.addPos(333, 2);
		list.traverse();
	}

}

class DLL {
	Node head;
	int size = 0;

	class Node {
		int data;
		Node next;
		Node prev;

		Node(int data, Node next, Node prev) {
			this.data = data;
			this.next = next;
			this.prev = prev;
			size++;

		}
	}

	void traverse() {
		if (head == null) {
			System.out.println("List is Empty...........");
			return;
		}
		Node currNode = head;
		while (currNode != null) {
			System.out.print(currNode.data + " =>");
			currNode = currNode.next;
		}
		System.out.println("NULL");
	}

	void addFirst(int data) {
		Node newNode = new Node(data, null, null);
		if (head == null) {
			head = newNode;

		} else {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
	}

	void addLast(int data) {
		Node newNode = new Node(data, null, null);
		if (head == null)
			head = newNode;
		else {
			Node currNode = head;
			while (currNode.next != null) {
				currNode = currNode.next;
			}
			currNode.next = newNode;
			newNode.prev = currNode;
		}
	}

	void addPos(int data, int pos) {
		int i = 0;
		if (pos < 0 || pos >= size) {
			System.out.println("Out of range .............");
			return;
		}
		Node newNode = new Node(data, null, null);
		if (head == null) {
			head = newNode;
			return;
		}
		if (pos != 0) {
			Node currNode = head, temp = null;
			while (currNode.next != null && i < pos) {
				temp = currNode;
				currNode = currNode.next;
				i++;
			}
			temp.next = newNode;
			newNode.prev = temp;
			newNode.next = currNode;
			currNode.prev = newNode;
		} else {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
	}
}