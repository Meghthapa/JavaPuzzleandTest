package creatingUserName;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class strings {
 
	public static void main(String[] args) {
		compare("Samyra");
		replace("Megh", "test");
		
		int i = Integer.parseInt("25");
		System.out.println(i);
		Integer j=Integer.valueOf("25");
		System.out.println(j);
		
		Name("Megh is a good developer");
		Name("This is a good way to store a element");
		
		
		
		
		
	
	}
	public static boolean compare(String input){
		System.out.println(input);
		boolean a =input.equals("abcd");
		if(input.isEmpty()){
			System.out.println("Please enter string");
		}else if(input.endsWith("a")){
			System.out.println("Your string ends at a");
		}else if(input.startsWith("S")){
			System.out.println("Your name starts with S");
		}else if(input.toUpperCase() != null){
			System.out.println("Convert to Uppercase:"+ input);
		}else{
		System.out.println(a);
		}
		return a;
	}
	public static StringBuilder replace(String input,String replace){
		StringBuilder sb = new StringBuilder();
		StringBuilder value=sb.append(input);
		StringBuilder rep=sb.append(replace);
		
		if(value != null){
			rep.replace(0, 0, "Test");
			System.out.println(sb);
			
		}
		return sb;
		
	}
	
	public static List<String> Name(String Name){
		List<String> name = new ArrayList<>();
		 name.add(Name);
		 for(String nm:name){
			System.out.print(nm+" ");
		 }
		 return name;
	} 
	
	
}
