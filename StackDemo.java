package collection;

import java.util.Stack;

public class StackDemo {
	public static void main(String[]args) {
		Stack<Integer> s=new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		System.out.println(s);
		s.pop();
		
		System.out.println("After pop : "+s);
		s.push(5);
		System.out.println("After push : "+s);
		
		System.out.println("Peek : "+s.peek());
		System.out.println("Emptyy???? " +s.isEmpty());
		s.clear();
		System.out.println("After clear : "+s);
		System.out.println("Emptyy???? " +s.isEmpty());
		
		
	}
}
