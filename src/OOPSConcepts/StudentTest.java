package OOPSConcepts;

public class StudentTest {

	public static void main(String[] args) {
		int[] students= new int[]{1001,1002,1003};
		
		Student s1 = new Student(students[0],"Megh",new char[]{'A'});
		s1.gender="Male";
		
		Student s2 = new Student(students[1],"Samyra");
		s2.gender="FeMale";
		
		Student s3 = new Student(students[2],"Sangam");
		s3.gender="FeMale";
		
        System.out.println(s1.name +" "+ s1.gender+" "+s1.grades.toString());
        System.out.println(s2.name +" "+ s2.gender);
        System.out.println(s3.name +" "+ s3.gender);
	}

}
