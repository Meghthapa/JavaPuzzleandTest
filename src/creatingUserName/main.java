package creatingUserName;

public class main {

	public static void main(String[] args) {
//		Username un= new Username("sangam",12345);
//		inheritance in=new inheritance("sangam",12345,19,"bhaisipati");
//		un.testage(4,5);
//         un.divide(10, 2);
//         un.test("sangam",12345);
//         methord wage=new methord("jpt",123456);
//         wage.dailywages(35, 8);
//         wage.Arraycheck();
//         int myArray = { {1, 2}, {4, 5}, {-1, 0}};
		month(8);
		reverse("Hello");
         
	}
	public static int month(int month){
		switch(month){
		case 1:
			System.out.println("january");
			break;
		case 2:
			System.out.println("February");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
			default:
				System.out.println("Month not found");
		}
		return month;
	}
	public static StringBuilder reverse(String input){
		StringBuilder sb = new StringBuilder();
		sb.append(input);
		sb=sb.reverse();
		System.out.println(sb);
		return sb;
		
	}
}
