package collection.dheeruClass;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Linkedllst {

	public static void main(String[] args) {
		List<Integer> listlink=new LinkedList<>();
		listlink.add(1);
		listlink.add(3);
		listlink.add(10);
		listlink.add(1);
		listlink.add(20);
		listlink.add(50);
		
  List<Integer> listtwo= new LinkedList<>();
  listtwo.addAll(listlink);
  System.out.println(listtwo);
  Iterator<Integer> a=listtwo.iterator();
  
  while(a.hasNext()){
	  int b= a.next();
	  System.out.println(b);
  }
		

	}

}
