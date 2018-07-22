package CodingBat;

import java.util.Arrays;

public class ArraysPractice {

	public static void main(String[] args) {
		
   
   sum2(2,5,2);
	}
	
	public static boolean samefirst(int...nums ){
      boolean result = false;		
		for(int i=0;i<nums.length;i++){
			if(nums[0] == nums[nums.length-1]){
				result = true;
			}
		}
		System.out.println(result);
		return false;
		
		
	}
	public static int sum(int...add){
		int sum =0;
		for(int i=0;i<add.length;i++){
			sum=sum+add[i];
		}
		System.out.println(sum);
		return sum;
	}
	public static int[] rotated(int...rotate){
		int[] rotate1={rotate[1],rotate[2],rotate[0]};
		System.out.println(Arrays.toString(rotate1));
		return rotate1;
	}
	
	public static int sum67(int...numbers){
		int sum = 0;
		boolean six=false;
		for(int i=0;i<numbers.length;i++){
			
			if(six){
				
				if(numbers[i]==7)
					six=false;
				else if(numbers[i]==6)
				  six=true;
				else
					sum +=numbers[i];
			}
		}
		System.out.println(sum);
		return sum;
	}
	public static boolean has22(int...input){
		boolean a= false;
		for(int i=0;i<input.length-1;i++){
			if(input[i]==2 && input[i+1]==2){
				a= true;
			}
		}
		System.out.println(a);
		return a;
	}
	public static boolean has13(int...input){
		boolean result= false;
		for(int i=0;i<input.length;i++){
			
			if(input[i]==1 || input[i]==3)
				result=false;
			else
				result=true;
			
		}
		System.out.println(result);
		return result;
	}
	public static int sum2(int...input){
		
		int sum =0;
		for(int i =0;i<input.length;i++){
			if(input[i]==2){
				sum +=2;
			}
		}
		System.out.println(sum);
		return sum;
	}

}
