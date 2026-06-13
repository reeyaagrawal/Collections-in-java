	package collection;

import java.util.ArrayList;

import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

	static class MyComparator implements Comparator<Integer>{

		public int compare(Integer o1, Integer o2) {
			return o2-o1;
		}
		
		//o1 o2 when return negative
		//o1 o2 when return zero(both are of same priority)
		//o2 o1 when return positive

		//"bye" "ok"
		
	}
	
	static class MyComparatorString implements Comparator<String>{

		public int compare(String o1, String o2) {
			
			// TODO Auto-generated method stub
			return o2.length()-o1.length();
		}

		//"bye" "ok"
		
	}
	


	public static void main(String[] args) {
		/*
		int []array= {1,2,3,4,5,6,7,8,9,10};
		List<int[]> list1=Arrays.asList(array);
	
		System.out.println(list1);
		List<Integer> list=new ArrayList<>();
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(20);
		list.add(3,40);
		System.out.println(list);//5 10 15 40 20 
		list.set(2,60);
		System.out.println(list);//5 10 60 40 20 
		System.out.println(list.size());
		for(int x:list) {
			System.out.print(x+" ");
		}
		System.out.println();
		list.remove(0);
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i) + " ");//10 60 40 20s
		}
		list.sort(new MyComparator());
		System.out.println(list);
		*/
		
		List<String> list =new ArrayList<>();
		list.add("apple");
		list.add("banana");
		list.add("mango");
		list.add("kiwi");
		list.add("guava");
		list.add("grapes");
		System.out.println(list);
		list.sort(new MyComparatorString());
		System.out.println(list);
	}

}
