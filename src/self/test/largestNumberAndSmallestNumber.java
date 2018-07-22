package self.test;

import java.util.Arrays;

public class largestNumberAndSmallestNumber {

	public static void main(String[] args) {
// 		int myarray[] ={-10,24,50,-88,98,123456};
//
//		int largest=myarray[0];
//		int smallest=myarray[0];
//		
//		for(int i=1;i< myarray.length;i++){
//			if(myarray[i]>largest){
//				largest=myarray[i];
//			}else if(myarray[i]<smallest){
//				smallest=myarray[i];
//			}
//		}
//		System.out.println("\n given array is"+ Arrays.toString(myarray));
//		System.out.println(largest);
//		System.out.println(smallest);
		
		int arrays[]={-20,30,-1001,18000};
		
		int largest=arrays[0];
		int smallest=arrays[1];
		
		for(int i=0;i<arrays.length;i++){
			if(arrays[i] > largest){
				largest=arrays[i];
			}else if(arrays[i]<smallest){
				smallest=arrays[i];
			}
		}
		System.out.println("Given Arrays="+Arrays.toString(arrays));
		System.out.println(largest);
		System.out.println(smallest);
	}

}
