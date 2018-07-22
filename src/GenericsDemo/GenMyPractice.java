package GenericsDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class GenMyPractice<T extends List> {

	public static void main(String[] args) {
	 
		test<String> tst= new anothertest<>();
		tst.set("Thapa");
		System.out.println(tst.get());
		
		test<Integer> tint= new anothertest<>();
		tint.set(12313);
        
		System.out.println(tint.get());
		
		test<List<Integer>> listStore= new anothertest<>();
		listStore.set(Arrays.asList(1,2,3));
		System.out.println(listStore.get());
		GenMyPractice<List> abc= new GenMyPractice<>();
	                 
	                      
	  }
	public void add(T List){
		List.add(0,new Object());
	}

	

}
interface test<T>{
	void set(T a);
	T get();
}
class anothertest<T> implements test<T>{
  private T a;
	@Override
	public void set(T a) {
		this.a=a;
		
	}

	@Override
	public T get() {
		
		return a;
	}
	
}




	

