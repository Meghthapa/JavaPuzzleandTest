package collection.dheeruClass;

public class threadExamples {

	public static void main(String[] args) {
		Task task = new Task();
		Thread thread = new Thread(task);
		thread.start();
       System.out.println("Inside main....");
       
       try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	}

}
class Task implements Runnable{

	@Override
	public void run() {
		System.out.println("Inside run...");
		go();
		
	}

	private void go() {
		System.out.println("Inside go()...");
		more();
		
	}

	private void more() {
		System.out.println("Inside more...");
		
	}

	
}