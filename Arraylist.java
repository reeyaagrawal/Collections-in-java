	package collection;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		System.out.println(list);
		list.add(2, 5);//1 2 5 3 4 5 6 7 8
		System.out.println("List after adding 5 at index 2 "+list);
		list.addFirst(0);//0 1 2 5 3 4 5 6 7 8
		System.out.println("List after adding 0 at index 0 "+list);
		int firstElement=list.getFirst();//return element at index 0
		System.out.println("First element : "+firstElement);
		int lastElement=list.getLast();//return last element
		System.out.println("Last element : "+lastElement);
		boolean empty=list.isEmpty();
		list.removeLast();//removes last element
		System.out.println("List after removing last element "+list);
		list.remove(1);//remove element at index 1
		System.out.println("List after removing element at index 1 "+list);
		list.removeFirst();//remove element at index 0
		System.out.println("List after removing first element "+list);
		System.out.println("Empty ??? "+empty);
	}
}
