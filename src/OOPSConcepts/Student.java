package OOPSConcepts;

public class Student {
 
	 int id;
	 String name;
	 String gender ="Male";
	 char[] grades;
	public Student(int id, String name) {
		this(name);
		this.id = id;
		
	}
	public Student(int id, String name,char[] grades) {
		this(name);
		this.id = id;
		this.grades=grades;
		
	}
	public Student(String name){
		this.name=name;
	}
	
	public boolean updateProfile(String name){
		this.name=name;
		return true;
	}
	 
	
}
