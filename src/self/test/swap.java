package self.test;

public class swap {

	public static void main(String[] args) {
		swap(2000, 100);
		
		

	}
	public static void swap(int a,int b){
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("A="+ a+" B="+b);
	}

}
