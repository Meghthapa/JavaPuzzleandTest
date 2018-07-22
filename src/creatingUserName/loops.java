package creatingUserName;

import java.util.Scanner;

public class loops {

	public static void main(String[] args) {
		userInput(5);
		switchForloop(4);

	}
	
	public static int userInput(int input){
		
		do{
			System.out.println("your number is "+ input);
		}while(input < 5) ;
		return input;
	}
	public static int switchForloop(int i){
		for( i=0;i>10;i++){
			switch(i){
			case 1:
				System.out.println("Number 1");
				break;
			case 2:
				System.out.println("number 2");
				break;
			case 3:
				System.out.println("number 3");
				break;
				default:
					System.out.println("other number");
		
			}
		}
		return i;
	}
	
} 