package GenericsDemo;

public class Demo {
	public static void main(String[] args) {
		Container<String> con = new Store<>();
		con.set("Java");
		System.out.println(con.get());
		Container<Integer> integer = new Store<>();
		integer.set(1000);
        System.out.println(integer.get());		
	
		
	}
}
interface Container<T>{
	void set(T a);
	T get();
	
}
class Store<T> implements Container<T>{
  private T a;
	
	public void set(T a) {
		this.a=a;
		
	}

	
	public T get() {
		
		return a;
	}

	

	
		
	}

	
	
	
