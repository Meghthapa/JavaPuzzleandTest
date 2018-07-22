package collection;


import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Employee {
	String name;
	int age;
	String designation;
	 
	public Employee(String name,int age,String designation){
		this.name=name;
		this.age=age;
		this.designation=designation;
	}
			
			
			
		
	
		public static List<String> addName(String name){
			List<String> allnames= new java.util.ArrayList<>();
			allnames.add(name);
			Iterator<String> itnames= allnames.iterator();
			while(itnames.hasNext()){
				System.out.println(name);
				break;
			}
			return allnames;
		}
		public static List<String> addlastName(String lastname){
			List<String> alllastname= new java.util.ArrayList<>();
			alllastname.add("ThapaThapa");
	        ListIterator<String> list=alllastname.listIterator();
	        while(list.hasNext()){
	        	System.out.println(list.nextIndex());
	        	break;
	        }
	        return alllastname;
	        
		
	}
	
}
		
		
	
 


