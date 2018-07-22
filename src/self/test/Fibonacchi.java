package self.test;

public class Fibonacchi {

	public static void main(String[] args) {
		
			
		


		int a = 0;
		int b= 1;
		int sum = 0;
		for(int i=0;i<21;){
			sum = i +b;
			b=i;
			a=sum;
			i=a;
			System.out.println(sum);
	
		}
	}

}
