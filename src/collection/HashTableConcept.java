package collection;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Hashtable h1  = new Hashtable<>();
        h1.put(1, "Megh");
        h1.put(2, "Sangam");
        h1.put(3, "Samyra");
        
        System.out.println(h1);
        
        Hashtable h2 = new Hashtable<>();
       h2= (Hashtable) h1.clone();
       System.out.println(h2);
       
      Enumeration e =h2.elements();
      while(e.hasMoreElements()){
    	  System.out.println(e.nextElement());
    	  
    // get all the values from hashtable using -- entrySet() -- set of hashtable values 
    	  
    	  Set a =h1.entrySet();
    	  System.out.println(a);
      }
	}

}
