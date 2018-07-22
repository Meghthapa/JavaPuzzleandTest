package self.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class DuplicateNumberArray {

	public static void main(String[] args) {
		
		
//		//compare each element 
//		for(int i=0;i<arr.length;i++){
//			for(int j=i+1;j<arr.length;j++){
//				if(arr[i].equals(arr[j])){
//					System.out.println("Duplicate value of arr: "+ arr[i]);
//				}
//			}
//		}
//		
//	 	//SecondSolution using hashset, it stores unique values 
//		Set<String> store = new HashSet<String>();
//		for(String names:arr){
//			if(store.add(names)== false){
//				System.out.println("Duplicate value of arr: "+ names);
//			}
//		}
//		
		String[] arr={"java","javascript","C","Ruby","java","C"};
		
		//1.Compare each element :o(nxn)--wrost solution
		for(int i = 0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i].equals(arr[j])){
					System.out.println("Duplicate elements will be:"+ arr[i]);
				}
			}
		}
		System.out.println("*************************");
		//Using HashSet : Java Collection:It share unique values:0(n)
		Set<String> s = new HashSet<String>();
		for(String a:arr){
			if(s.add(a)==false){
				System.out.println("Duplicate elements will be:"+ a);	
			}
		}
		System.out.println("***********");
		
		Map<String,Integer> storemap = new HashMap<>();
		for(String b:arr){
			Integer count=storemap.get(b);
			if(count == null){
				storemap.put(b, 1);
			}else{
				storemap.put(b, ++count);
			}
		}
		//get the values from this Hashmap o(2n)
		Set<Entry<String,Integer>> entryset=storemap.entrySet();
		for(Entry<String,Integer> entry:entryset ){
			if(entry.getValue()>1){
				System.out.println(entry.getValue()+" "+entry.getKey());
			}
		}

	}

}
