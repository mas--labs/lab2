import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Plus {

	private static HashMap<Class<?>, List<Plus>> map = new HashMap<>();
	
	public Plus() {

		List<Plus> list = map.get(this);
		if(list == null) {
			list = new ArrayList<>();
			list.add(this);
			map.put(this.getClass(), list);
		}
		
		if(! list.contains(this))
			list.add(this);
	}
	
	public static List<?> getInstances(Class c) {
		return map.get(c);
	}


	public static void main(String[] s) {
		
		
		System.out.println(Person.getInstances(Person.class));
		System.out.println(A.getInstances(A.class));
	}
}

class A extends Plus {
	String s;

	public A(String s) {
		this.s = s;
	}

	@Override
	public String toString() {
		return "A [s=" + s + "]";
	}
	
	
	
}
