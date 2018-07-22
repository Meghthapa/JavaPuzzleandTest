package creatingUserName;

public class Username {
	
  String username;
  int password;
 
  public Username(String username,int password){
	  if(username=="sangam" && password==12345){
 		 System.out.println("you are logged in ");
 	 }else{
 		 System.out.println("Invalid username and password ");
 		 
 	 }
	 
  }
  public void testage(int x,int y){
	    System.out.println(x + y);
  }
	public void divide(int x, int y){
		System.out.println(x/y);
	}
     public void test(String username,int password){
    	 if(username=="sangam" && password==12345){
    		 System.out.println("you are logged in ");
    	 }else{
    		 System.out.println("Invalid username and password ");
    		 
    	 }
     }

}
