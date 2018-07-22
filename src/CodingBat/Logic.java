package CodingBat;

public class Logic {

	public static void main(String[] args) {
	
		teensum(20,25);
		
	}
	public static boolean specialEleven(int...number){
		int i;
		boolean result=false;
		for( i=0;i<number.length;i++){
			if(i % 11==0|| i % 11==0+1){
				result= true;
			}else{
				result= false;
			}
		}
		System.out.println(result);
		return result;
		
	}
	public static boolean less20(int...input){
		boolean result=false;
		for(int i=0;i<input.length;i++){
			if(input[i]+1 % 20==0 ||input[i]+2 % 20==0 ){
				result = true;
			}else{
				result = false;
			}
		}
		System.out.println(result);
		return result;
	}
	public static boolean near10(int n){
		boolean result = (n % 10 >=8||n % 10 <=2);
		System.out.println(result);
		return result;
		
	}
	public static int teensum(int a,int b){
		int result= (a>=13 && a<=19 || b>=13 && b<=19)?19:a+b;
		System.out.println(result);
		return result;
				
	}

}
