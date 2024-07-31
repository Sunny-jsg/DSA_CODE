package com.pb.in;

// infinite recursion
public class Test {
	public static void main(String[] args) {
		Demo d = new Demo();
		d.m1();
	}

}

class Demo {
	void m1() {
		System.out.println("Good Morning ::");
		m1();
	}
}
