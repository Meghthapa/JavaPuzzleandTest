package CodingBat;

public class arrayWarmup {

	public static void main(String[] args) {
		
  stringMatch("xxcaazz", "xxbaaz");
	}
	
	public static boolean array123(int...number){
		boolean result=false;
		for(int i=0;i<number.length-2;i++){
			if(number[i]==1 && number[i+1]==2 && number[i+2]==3){
				result= true;
			}
		}
		System.out.println(result);
		return result;
	}
	public static int stringMatch(String a, String b){
		
		int len= Math.min(a.length(), b.length());
		int count =0;
		
		for(int i=0;i<len-1;i++){
			String aSub=a.substring(i, i+2);
			String bSub=b.substring(i, i+2);
			
			if(aSub.equals(bSub)){
				count++;
			}
		}
		System.out.println(count);
		return count;
	}

}
