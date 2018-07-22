package CodingBat;

public class StringCodingBat {

	public static void main(String[] args) {
		fizzbizz("fig","bib","fib");
		
		
		
		 
	}
	public static String fizzbizz(String...names){
		String empty="";
		for(char i=0;i<names.length;i++){
			boolean fizz=names[i].charAt(0)=='f';
			boolean buzz=names[i].charAt(names.length-1)=='b';
			if(fizz && buzz)
				empty += "FizzBuzz";
			if(fizz)
				empty +="Fizz";
			if(buzz)
				empty += "Buzz";
			
		}
		System.out.println(empty.toString());
		return empty;
		
	}

}
