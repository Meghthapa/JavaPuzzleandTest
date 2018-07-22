package collection.dheeruClass;

import java.util.ArrayDeque;
import java.util.Deque;

public class Arraydeque {

	public static void main(String[] args) {
		Deque<String> deque= new ArrayDeque<>();
		deque.add("HeadBook");
		deque.add("secondBook");
		deque.add("Thirdbook");
		
		deque.remove();
		System.out.println(deque);
		deque.push("Firstbook");
		System.out.println(deque);
	}

}
