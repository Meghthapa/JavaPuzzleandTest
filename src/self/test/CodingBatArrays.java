package self.test;

public class CodingBatArrays {

	public static void main(String[] args) {
		
		
		
		sum13(1,2,3,4,13,12);
		}

	
	public static int evenNumbers(int input){
		int i;
		for( i=0;i<input;i++){
			if(i % 2==0){
				System.out.print(i+ " ");
			}
			
		}
		
		return i;
	}
	public static int countEven(int...nums){
		int count =0;
		for(int i=0;i<nums.length;i++){
		 if(nums[i] % 2 == 0){
			 count++;
		 }	
		}
		System.out.println(count);
		return count;
	}
	public static int minmax(int...number){
		int min=number[0];
		int max =number[0];
		
		for(int i =0;i<number.length;i++){
			if(number[i]>max){
				max=number[i];
			}else if(number[i]<min){
				min=number[i];
			}
		}
		System.out.println(max-min);
		return(max-min);
		
	}
	public static int centeravg(int...input){
		int min =input[0];
		int max = input[0];
		int sum = input[0];
		
		for(int i =0;i<input.length;i++){
			sum +=input[i];
			if(input[i]>max){
				max=input[i];
			}else if(input[i]<min){
				min = input[i];
			}
			
		}
		System.out.println((sum-max-min)/(input.length-2));
		return (sum-max-min)/(input.length-2);
	}
	public static int sum13(int...number){
		int sum =0;
		 for(int i=0;i<number.length;i++){
			 if(number[i] ==13){
				 i++;
			 }else{
				 sum +=number[i];
			 }
		 }
		 System.out.println(sum);
		 return sum;
	}

}
