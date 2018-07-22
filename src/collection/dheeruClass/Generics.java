package collection.dheeruClass;

import java.util.ArrayList;
import java.util.List;

public class Generics {

	public static void main(String[] args) {
		anotherClass<String> an=new anotherClass<String>("twenty", "Megh", "1234 Address", "123@abc.com");
		anotherClass<Integer> an2=new anotherClass<Integer>(37, 12345, 1234564, 1234561);
		
		@SuppressWarnings("rawtypes")
		List<anotherClass> mylist= new ArrayList<>();
		mylist.add(an);
		mylist.add(an2);
		
		for(@SuppressWarnings("rawtypes") anotherClass li:mylist){
			System.out.println(li.address);
			System.out.println(li.age);
			System.out.println(li.emailaddress);
		}
		

	}

}
class anotherClass<T>{
	public T age;
	public T name;
	public T address;
	public T emailaddress;
	
	
	public anotherClass(T age, T name, T address, T emailaddress) {
		
		this.age = age;
		this.name = name;
		this.address = address;
		this.emailaddress = emailaddress;
	}
	
	
	
	
	
}