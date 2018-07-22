package collection.dheeruClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class arraylist  {
  
	static List<Integer> list1;
	public static void main(String[] args) {
		
		list1= new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(1);
		list1.add(4);
		addnumber(12);
		
		remove(2);
		System.out.println(list1);
		
		
		List<Integer> anotherlist = new ArrayList<>();
		anotherlist.addAll(list1);
		anotherlist.add(10);
		anotherlist.add(20);
		anotherlist.add(30);
		anotherlist.add(40);
		anotherlist.add(50);
		System.out.println(anotherlist);
		
		List<Integer> secondlist= new ArrayList<>();
		secondlist.addAll(anotherlist);
		secondlist.add(60);
		secondlist.add(70);
		secondlist.add(80);
		secondlist.add(90);
		secondlist.add(100);
		System.out.println(secondlist);
		
		System.out.println(secondlist.contains(12));
		System.out.println(secondlist.indexOf(12));
		System.out.println(secondlist.lastIndexOf(12));
		System.out.println();
		
		Iterator<Integer> iter=secondlist.iterator();
		while(iter.hasNext()){
			int element=iter.next();
			
			if(element ==100){
				iter.remove();
				System.out.println(secondlist);
			}
		}
		
		
	}
	
	public static boolean remove(Integer num){
		return list1.remove(num);
	}
	
	public static boolean addnumber(Integer num){
		return list1.add(num);
	}
	public static boolean removeall(){
		return list1.removeAll(list1);
	}

}
