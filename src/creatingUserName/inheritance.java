package creatingUserName;

public class inheritance extends Username {
    int age;
    String address;
	public inheritance( String username, int password,int age,String address) {
		super(username, password);
		this.address= address;
		this.age=age;
		
		if (age<= 18 && address !="manbhawan"){
			System.out.println(" you are underage");
			System.out.println("Not in Nepal");
		
		}else {
			
			System.out.println("you access is denied");
		}
	}

}
