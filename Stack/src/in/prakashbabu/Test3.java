package in.prakashbabu;

import java.util.Stack;

public class Test3 {
	public static void main(String[] args) {
		Stack s = new Stack();
		System.out.println(s.empty());//true
		s.push(111);
		s.push(222);
		s.push(333);
		s.push(444);
		s.push(555);
		System.out.println(s);//[111,222,333,444,555]
		System.out.println(s.peek());//555
		System.out.println(s.pop());//555
		System.out.println(s);//[111,222,333,444]
		System.out.println(s.search(333));//2
		System.out.println(s.search(555));//-1
	}

}
