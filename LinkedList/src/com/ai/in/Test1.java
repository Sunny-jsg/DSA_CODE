package com.ai.in;

public class Test1 {
	public static void main(String[] args) {
		LL list = new LL();
		list.addfirst(333);
		list.addfirst(222);
		list.addfirst(111);
		list.addlast(444);
		list.addlast(555);
		list.printlist();
		list.deletefirst();
		list.printlist();
		list.deletefirst();
		list.printlist();
		list.deletelast();
		list.printlist();
		list.deletelast();
		list.printlist();
		list.deletelast();
		list.printlist();
	}

}

class LL {
	Node head;

	class Node {
		int data;
		Node next;

		public Node(int data) {

			this.data = data;
			this.next = null;
		}

	}

	void addfirst(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;

		}
		newNode.next = head;
		head = newNode;
	}

	void addlast(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;

		}
		Node temp1 = head;
		while (temp1.next != null)
			temp1 = temp1.next;
		temp1.next = newNode;
	}
	void deletefirst () {
		if(head == null) {
			System.out.println("List is Empty");
		}
		head = head.next;
		
	}
	void deletelast() {
		if(head == null) {
			System.out.println("List is Empty");
			return;
		}
		if(head.next == null) {
			head =null;
			return;
		}
		Node temp1,temp2;
		temp1 =head;
		temp2 = head.next;
		while(temp2.next !=null) {
			temp2 = temp2.next;
		    temp1= temp1.next;
		}
		temp1.next = null;
		    
	}

	void printlist() {
		if (head == null) {
			System.out.println("List is Empty");
			return;
		}
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " => ");
			temp = temp.next;

		}
		System.out.println("Null");
	}
}