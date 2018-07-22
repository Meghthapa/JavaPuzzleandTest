package collection.dheeruClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class GenericsMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    TypeArgInterference(21);
    TypeArgInterference("Java");
    TypeArgInterference(21.0);
    TypeArgInterference(28.978F);
    
    Integer[] myint= new Integer[100];
    Collection<Number> colnum= new ArrayList<>();
    arrayToCollection(myint, colnum);
    List<Integer> intlist=Arrays.asList(12,13,14);
	display(intlist);
	List<Double> mydouble=Arrays.asList(12.0,13.0,14.0);
	display(mydouble);
	List<Number> numlist= new ArrayList<>();
	
	aggregateWithConsumer(intlist, mydouble, numlist);
	System.out.println(numlist);
    
	}
	
	public static <T> void TypeArgInterference(T object){
		System.out.println("Type Argument"+ object.getClass().getName());
		
	}
	public static <T> List<T> typeArgInterfacrFromTargetType2(){
		List<String> list=new ArrayList<>();
		list.add("abc");
		return (List<T>) list;
		
	}
	public static <T> void arrayToCollection(T[]a,Collection<T>c){
		for(T ab:a){
			c.add(ab);
			
		}
		 
	}
	static void display(List<? extends Number>list){
		for(Number element: list){
			System.out.println(element);
		}
	}
	public static <E> void aggregateWithConsumer(List<? extends E>l1,List<? extends E>l2,List<? super E>l3){
		l3.addAll(l1);
		l3.addAll(l2);
		
		
	}
	public static <E> void aggregate(List<E>l1,List<E>l2,List<E>l3){
		l3.addAll(l1);
		l3.addAll(l2);
	}

}
