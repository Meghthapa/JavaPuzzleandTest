package self.test;

public class Reverse {

	public static void main(String[] args) {
		
		String s ="Nepal";
		String b = "";
		
		for(int i =s.length()-1;i>=0;i--){
			b +=s.charAt(i);
		}
		System.out.println(b);
		

}
	public static StringBuilder reverse(String input){
		StringBuilder s = new StringBuilder();
		s.append(input);
		s.reverse().toString();
		System.out.println(s);
		return s;
	}
}