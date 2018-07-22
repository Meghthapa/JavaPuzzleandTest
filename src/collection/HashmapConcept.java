package collection;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashmapConcept {
   
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer,String>();
		hm.put(1, "Selenium");
		hm.put(2, "QTP");
		hm.put(3, "Testcomplete");
		
		for(Entry m:hm.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	}
	
}
