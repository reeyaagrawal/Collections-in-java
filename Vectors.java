package collection;

import java.util.Vector;

public class Vectors {
	public static void main(String[]args) {
		Vector<Integer> vector=new Vector<>();
		vector.add(1);
		vector.add(2);
		vector.add(3);
		System.out.println(vector);
		vector.addFirst(0);
		System.out.println("Vector after adding 0 at first : "+vector);
		vector.addLast(10);
		System.out.println("Vector after adding 10 at last : "+vector);
		vector.remove(1);
		System.out.println("Vector after removing element at index 1 : "+vector);
		vector.removeFirst();
		System.out.println("Vector after removing element at index 0 : "+vector);
		vector.removeLast();
		System.out.println("Vector after removing element at last index  : "+vector);
		System.out.println("Size of vector : "+vector.size());
		System.out.println("Capacity of vector : "+vector.capacity());
		System.out.println("Empty???? "+vector.isEmpty());
		vector.clear();
		System.out.println("After clear : "+vector);
		System.out.println("Empty???? "+vector.isEmpty());
		
		
		
		
		
	}

}
