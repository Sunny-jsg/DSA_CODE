package com.pb.in;

//finite Recursion 
public class Test1 {
	public static void main(String[] args) {
		Demo1 d1 = new Demo1();
		d1.m1();
	}

}

class Demo1 {
	static int c;

	void m1() {
		if (c > 10)
			return;
		else {
			System.out.println("Good Morning c=" + c);
			c++;
			m1();
		}
	}
}
