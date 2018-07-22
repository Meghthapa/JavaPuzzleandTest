package self.test;

public class MissingNumberInArray {

	public static void main(String[] args) {
		
		int[] array={1,2,3,5,6};
		int sum =0;
		
		for(int i=0;i<array.length;i++){
			sum = sum +array[i];
		}
		System.out.println(sum);
		int sum1=0;
		for(int j=1;j<=6;j++){
			sum1 =sum1+j;
			
		}
		System.out.println(sum1);
		System.out.println("Missing number is:"+ (sum1-sum));
		
		

	}

}
