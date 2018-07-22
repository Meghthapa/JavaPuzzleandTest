package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map.Entry;

public class main {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("test");
		ll.add("Selenium");
		ll.add("QTP");
		ll.add("RPA");
		ll.add("RFI");
		System.out.println(ll);
		ll.addFirst("hello");
		ll.addLast("Friends");
		System.out.println(ll.get(0));
		
		
		Employee em = new Employee("Megh", 38, "QA");
		Employee em1 = new Employee("Sangam", 33, "Dentist");
		Employee em2 = new Employee("Samyra", 7, "King");
		
		ArrayList<Employee> EM= new ArrayList<Employee>();
		EM.add(em);
		EM.add(em1);
		EM.add(em2);
	   Iterator<Employee> it = EM.iterator();
	   while(it.hasNext()){
		Employee store= it.next();
		System.out.println(store.name);
		System.out.println(store.age);
		System.out.println(store.designation);
		
		HashMap<Integer, Employee> hme= new HashMap<Integer,Employee>();
		Employee em3 = new Employee("Megh", 38, "QA");
		Employee em4 = new Employee("Sangam", 33, "Dentist");
		Employee em5 = new Employee("Samyra", 7, "King");
		 hme.put(1, em3);
		 hme.put(2, em4);
		 hme.put(3, em5);
		 
		 for(Entry<Integer,Employee> m:hme.entrySet()){
			 int key = m.getKey();
			 Employee e = m.getValue();
			 System.out.println(key+" info");
			 
			 System.out.println(e.name+" "+e.age+" "+e.designation);
		 }
	   }
	}

}
