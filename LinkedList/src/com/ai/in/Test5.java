package com.ai.in;

import com.ai.in.LL.Node;

public class Test5 {
	public static void main(String[] args) {
		SLL5 list1 = new SLL5();
		list1.addFirst(444);
		list1.addFirst(333);
		list1.addFirst(222);
		list1.addFirst(111);
		list1.printList();
		SLL5 list2 = new SLL5();
		list2.addLast(111);
		list2.addLast(222);
		list2.addLast(333);
		list2.addLast(444);
		list2.printList();

		System.out.println(list1.compareList1(list2));
	}

}

class SLL5 {
	Node head;
	int size;

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
			size++;
		}

		Node(int data, Node temp) {
			this.data = data;
			this.next = temp;
			size++;
		}
	}

//1. get the size of the list.
	int getSize() {
		return this.size;
	}

	// 2. Inserting the data first
	void addFirst(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}

//3. Inserting the data last
	void addLast(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node currNode = head;
		while (currNode.next != null)
			currNode = currNode.next;
		currNode.next = newNode;
	}

//4. Inserting the data at position
	void addPos(int data, int pos) {
		int i = 0;
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		if (pos != 0) {
			Node currNode = head;
			Node prevNode = null;
			while (currNode.next != null && i < pos) {
				prevNode = currNode;
				currNode = currNode.next;
				i++;
			}
			prevNode.next = newNode;
			newNode.next = currNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
	}

//5. Sorted Insertion Asc
	void sortedInsertAsc(int data) {
		Node newNode = new Node(data);
		Node currNode = head;
		if (currNode == null || currNode.data > data) {
			newNode.next = head;
			head = newNode;
			return;
		}
		while (currNode.next != null && currNode.next.data < data) {
			currNode = currNode.next;
		}
		newNode.next = currNode.next;
		currNode.next = newNode;
	}

//6. Sorted Insertion Desc
	void sortedInsertDesc(int data) {
		Node newNode = new Node(data);
		Node currNode = head;
		if (currNode == null || currNode.data < data) {
			newNode.next = head;
			head = newNode;
			return;
		}
		while (currNode.next != null && currNode.next.data > data) {
			currNode = currNode.next;
		}
		newNode.next = currNode.next;
		currNode.next = newNode;
	}

	// 7. Deleting from first
	void deleteFirst() {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		size--;
		head = head.next;
	}

	// 8. Deleting from last
	void deleteLast() {
		if (head == null) {
			System.out.println("list is empty");
			return;
		}
		if (head.next == null) {
			head = null;
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

	// 9 .Deleting element
	void deleteElement(int data) {
		Node temp = head;
		if (temp == null) {
			System.out.println("empty");
			return;
		}
		if (temp.data == data) {
			head = head.next;

			size--;
			return;
		}
		while (temp.next != null) {
			if (temp.next.data == data) {
				temp.next = temp.next.next;
				size--;
				return;
			}
			temp = temp.next;
		}
	}

	// 10. Deleting elements
	void deleteElements(int data) {
		Node temp = head;
		if (temp == null) {
			System.out.println("empty");
			return;
		}
		if (temp.data == data) {
			head = head.next;
			size--;
		}
		while (temp.next != null) {
			if (temp.next.data == data) {
				temp.next = temp.next.next;
				size--;
			}
			if (temp.next != null)
				temp = temp.next;
		}
	}

	// 11.Deleting from position
	void deleteElementAtPos(int pos) {
		Node temp = head;
		int i = 0;
		if (temp == null) {
			System.out.println("empty");
			return;
		}
		if (pos == 0) {
			head = head.next;
			size--;
			return;
		}
		while (temp.next != null && i < pos) {
			if (i == pos - 1) {
				temp.next = temp.next.next;
				size--;
				return;
			}
			i++;
			temp = temp.next;
		}
	}

	// 12. print the list element
	void printList() {
		if (head == null) {
			System.out.println("list is empty");
		}
		Node currNode = head;
		while (currNode != null) {
			System.out.print(currNode.data + " => ");
			currNode = currNode.next;
		}
		System.out.println("null");
	}

//13.Searching 
	boolean search(int data) {
		Node currNode = head;
		while (currNode != null) {
			if (currNode.data == data)
				return true;
			currNode = currNode.next;
		}
		return false;
	}

	// 14. reverse list
	void reverse() {
		Node curr = head, prev = null, next = null;
		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
	}

	// reverseRecursive
	void reverseR() {
		head = reverseRUtil(head, null);
	}

	Node reverseRUtil(Node currNode, Node nextNode) {
		Node res;
		if (currNode == null)
			return null;
		if (currNode.next == null) {
			currNode.next = nextNode;
			return currNode;
		}
		res = reverseRUtil(currNode.next, currNode);
		currNode.next = nextNode;
		return res;
	}

	// 15. deleting duplicates \\ first sorted the list
	void removeDuplicates() {
		Node currNode = head;
		while (currNode != null) {
			if (currNode.next != null && currNode.data == currNode.next.data)
				currNode.next = currNode.next.next;
			else
				currNode = currNode.next;
		}
	}

	// 16. copy the reverse list
	SLL5 copyReversedList() {
		Node temp1 = null, temp2 = null, currNode = head;
		while (currNode != null) {
			temp2 = new Node(currNode.data, temp1);
			currNode = currNode.next;
			temp1 = temp2;
		}
		SLL5 obj = new SLL5();
		obj.head = temp1;
		return obj;
	}

	// 17. copy the original list
	SLL5 copyList() {
		Node headNode = null, tailNode = null, tempNode = null, currNode = head;
		if (currNode == null)
			return null;
		headNode = new Node(currNode.data, null);
		tailNode = headNode;
		currNode = currNode.next;
		while (currNode != null) {
			tempNode = new Node(currNode.data, null);
			tailNode.next = tempNode;
			tailNode = tempNode;
			currNode = currNode.next;
		}
		SLL5 obj = new SLL5();
		obj.head = headNode;
		return obj;
	}

	// 18.Comparing two list objects
	boolean compareList1(SLL5 list) {
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

	// 17 (recursive method)
	boolean compareList2(SLL5 list) {
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

	// 19. Finding nth node from begin
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

	// 20.Finding nth node from end
	int nthNodeFromEnd(int index) {
		int size = getSize();
		int sindex;
		if (size != 0 && size < index)
			return -1;
		sindex = size - index + 1;
		return nthNodeFromBegin(sindex);
	}

}