package com.ait.doubleLinkedList;

public class Test {
	public static void main(String[] args) {
		DLL list = new DLL();

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
			System.out.println("List is Empty");
			return;
		}
		Node currNode = head;
		while (currNode != null) {
			System.out.print(currNode.data + " => ");
			currNode = currNode.next;
		}
		System.out.println("NULL");
	}

	void addFirst(int data) {
		Node newNode = new Node(data, null, null);
		if (head == null)
			head = newNode;
		else {
			head.prev = newNode;
			newNode.next = head;
			head = newNode;
		}
	}

	void addLast(int data) {
		Node newNode = new Node(data, null, null);
		if (head == null)
			head = newNode;
		else {
			Node currNode = head;
			while (currNode.next != null)
				currNode = currNode.next;
			currNode.next = newNode;
			newNode.prev = currNode;
		}
	}

	void addPos(int data, int pos) {
		int i = 0;
		if (pos < 0 || pos >= size) {
			System.out.println("out of range");
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

	void sortedInsertAsc(int data) {
		Node newNode = new Node(data, null, null);
		Node currNode = head;
		if (currNode == null) {
			head = newNode;
			return;
		}
		if (currNode.data > data) {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
			return;
		}
		while (currNode.next != null && currNode.next.data < data)
			currNode = currNode.next;
		if (currNode.next != null) {
			newNode.next = currNode.next;
			currNode.next.prev = newNode;
			currNode.next = newNode;
			newNode.prev = currNode;
		} else {
			currNode.next = newNode;
			newNode.prev = currNode;
		}
	}

	void sortedInsertDesc(int data) {
		Node newNode = new Node(data, null, null);
		Node currNode = head;
		if (currNode == null) {
			head = newNode;
			return;
		}
		if (currNode.data < data) {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
			return;
		}
		while (currNode.next != null && currNode.next.data > data)
			currNode = currNode.next;
		if (currNode.next != null) {
			newNode.next = currNode.next;
			currNode.next.prev = newNode;
			currNode.next = newNode;
			newNode.prev = currNode;
		} else {
			currNode.next = newNode;
			newNode.prev = currNode;
		}
	}

	int getSize() {
		return this.size;
	}

	boolean search(int data) {
		Node temp = head;
		while (temp != null) {
			if (temp.data == data)
				return true;
			temp = temp.next;
		}
		return false;
	}

	void deleteFirst() {
		if (head == null) {
			System.out.println("DLL is empty");
			return;
		}
		size--;
		head = head.next;
		if (head != null)
			head.prev = null;
	}

	void deleteLast() {
		if (head == null) {
			System.out.println("DLL is empty");
			return;
		}
		if (head.next == null) {
			head = null;
			size--;
			return;
		}
		size--;
		Node temp1 = head, temp2 = head.next;
		while (temp2.next != null) {
			temp2 = temp2.next;
			temp1 = temp1.next;
		}
		temp1.next = null;
	}

	void deleteElementAtPos(int pos) {
		Node temp1 = head, temp2;
		int i = 0;
		if (temp1 == null) {
			System.out.println("DLL is empty");
			return;
		}
		if (pos < 0 || pos >= size) {
			System.out.println("out of range");
			return;
		}
		if (pos == 0) {
			head = head.next;
			if (head != null)
				head.prev = null;
			size--;
			return;
		}
		while (temp1.next != null && i < pos) {
			if (i == pos - 1) {
				temp1.next = temp1.next.next;
				temp2 = temp1.next;
				if (temp2 != null)
					temp2.prev = temp1;
				size--;
				return;
			}
			i++;
			temp1 = temp1.next;
			temp2 = temp1.next;
		}
	}

	void deleteElement(int data) {
		Node temp1 = head, temp2;
		if (temp1 == null) {
			System.out.println("DLL empty");
			return;
		}
		if (temp1.data == data) {
			head = head.next;
			if (head != null)
				head.prev = null;
			size--;
			return;
		}
		while (temp1.next != null) {
			if (temp1.next.data == data) {
				temp1.next = temp1.next.next;
				temp2 = temp1.next;
				if (temp2 != null)
					temp2.prev = temp1;
				size--;
				return;
			}
			temp1 = temp1.next;
		}
	}

	void deleteElements(int data) {
		Node temp1 = head, temp2;
		if (temp1 == null) {
			System.out.println("DLL empty");
			return;
		}
		if (temp1.data == data) {
			head = head.next;
			if (head != null)
				head.prev = null;
			size--;
		}
		while (temp1.next != null) {
			if (temp1.next.data == data) {
				temp1.next = temp1.next.next;
				temp2 = temp1.next;
				if (temp2 != null)
					temp2.prev = temp1;
				size--;
			}
			if (temp1.next != null)
				temp1 = temp1.next;
		}
	}

	void removeDuplicates() {
		Node currNode = head, temp;
		while (currNode != null) {
			if (currNode.next != null && currNode.data == currNode.next.data) {
				currNode.next = currNode.next.next;
				temp = currNode.next;
				if (temp != null)
					temp.prev = currNode;
			} else
				currNode = currNode.next;
		}

	}

	DLL copyList() {
		Node headNode = null, tailNode = null, tempNode = null, currNode = head;
		if (currNode == null)
			return null;
		headNode = new Node(currNode.data, null, null);
		tailNode = headNode;
		currNode = currNode.next;
		while (currNode != null) {
			tempNode = new Node(currNode.data, null, null);
			tailNode.next = tempNode;
			tempNode.prev = tailNode;
			tailNode = tempNode;
			currNode = currNode.next;
		}
		DLL obj = new DLL();
		obj.head = headNode;
		return obj;
	}

	DLL copyReversedList() {
		Node temp1 = null, temp2 = null, currNode = head;
		while (currNode != null) {
			temp2 = new Node(currNode.data, temp1, null);
			currNode = currNode.next;
			if (temp1 != null)
				temp1.prev = temp2;
			temp1 = temp2;
		}
		DLL obj = new DLL();
		obj.head = temp1;
		return obj;
	}

	boolean compareListI(DLL list) {
		Node head1 = head, head2 = list.head;
		while (head1 != null && head2 != null) {
			if (head1.data != head2.data)
				return false;
			head1 = head1.next;
			head2 = head2.next;
		}
		if (head1 == null && head2 == null)
			return true;
		return false;
	}

	boolean compareListR(DLL list) {
		return compareList(head, list.head);
	}

	boolean compareList(Node head1, Node head2) {
		if (head1 == null && head2 == null)
			return true;
		else if (head1 == null || head2 == null || (head1.data != head2.data))
			return false;
		else
			return compareList(head1.next, head2.next);
	}

	int nthNodeFromBegin(int index) {
		if (index > getSize() || index < 1)
			return -1;
		int count = 0;
		Node currNode = head;
		while (currNode != null && count < index - 1) {
			count++;
			currNode = currNode.next;
		}
		return currNode.data;
	}

	int nthNodeFromEnd(int index) {
		int size = getSize();
		int sindex;
		if (size != 0 && size < index)
			return -1;
		sindex = size - index + 1;
		return nthNodeFromBegin(sindex);
	}

	void reverse() {
		Node temp = null, currNode = head;
		while (currNode != null) {
			temp = currNode.prev;
			currNode.prev = currNode.next;
			currNode.next = temp;
			currNode = currNode.prev;
		}
		if (temp != null)
			head = temp.prev;

	}

}