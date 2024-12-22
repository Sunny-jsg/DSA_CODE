package com.ai.in;

import com.ai.in.LL.Node;

public class Test3 {
	public static void main(String[] args) {
		SLL2 list = new SLL2();
		/*list.addFirst(555);
		list.addFirst(666);
		list.addLast(777);
		list.addLast(222);
		list.addLast(444);
		
		list.printList();
		
		list.addPosition(888, 0);
		list.printList();
		list.sortedInsertASC(5);
		list.sortedInsertASC(7);
		list.sortedInsertASC(2);
		list.sortedInsertASC(8);
		list.sortedInsertASC(1);
		list.sortedInsertASC(6);
		list.sortedInsertASC(3);
		list.sortedInsertASC(4);
		list.printList();
		list.sortedInsertDESC(3);
		list.sortedInsertDESC(5);
		list.sortedInsertDESC(7);
		list.sortedInsertDESC(1);
		list.sortedInsertDESC(6);
		list.sortedInsertDESC(2);
		list.sortedInsertDESC(9);
		list.sortedInsertDESC(4);
		list.sortedInsertDESC(8);
		list.printList();*/
	}

}

class SLL2 {
	Node head;

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;

		}
	}

	void printList() {
		if (head == null) {
			System.out.println("List is Empty");
			return;
		}
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "=>");
			temp = temp.next;
		}
		System.out.println("NULL");
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

	void addPosition(int data, int position) {
		int i = 0;
		Node newNode = new Node(data);
		if (head == null) {
			newNode = head;
			return;
		}
		if (position != 0) {
			Node currentNode = head;
			Node previousNode = null;
			while (currentNode.next != null && i < position)
				previousNode= currentNode;
			currentNode = currentNode.next;
			i++;
		} else {
			newNode.next = head;
			head = newNode;
		}
	}
	void sortedInsertASC(int data) {
		Node newNode = new Node(data);
		Node currentNode = head;
		if(currentNode == null || currentNode.data >data) {
			newNode.next = head;
			head = newNode;
			return;
			
		}
		while(currentNode.next != null && currentNode.data < data) {
			currentNode =currentNode.next;
		}
		newNode.next =currentNode.next;
		currentNode.next = newNode;
	}
	void sortedInsertDESC(int data) {
		Node newNode = new Node(data);
		Node currentNode = head;
		if(currentNode == null || currentNode.data < data) {
			newNode.next = head;
			head = newNode;
			return;
			
		}
		while(currentNode.next != null && currentNode.data > data) {
			currentNode =currentNode.next;
		}
		newNode.next =currentNode.next;
		currentNode.next = newNode;
	}
}

