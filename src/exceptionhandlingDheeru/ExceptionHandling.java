package exceptionhandlingDheeru;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling {

	public static void main(String[] args) {
		System.out.println("\nInside main");
		share();
		System.err.println("\nEnd of main");

	}
	public static void share(){
		System.out.println("\nInside share...");
		try {
			HttpConnect.send(0,"hello","http://www,goodsnips.com");
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			System.out.println("please enter correct file");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Connecting into the different server...");
		}
		System.out.println("\nEnd of share");
	}

}
