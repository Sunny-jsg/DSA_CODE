package in.prakashbabu;

import java.util.Stack;

public class Test4 {
	public static void main(String[] args) {
		Stack<String> s = new Stack<String>();
		System.out.println(s.empty());//true
		s.push("AAA");
		s.push("BBB");
		s.push("CCC");
		s.push("DDD");
		System.out.println(s.empty());//false
		System.out.println(s.peek());//DDD
		System.out.println(s.search("CCC"));//2
		System.out.println(s.pop());//DDD
		System.out.println(s);//[AAA,BBB,CCC]
	}

}
