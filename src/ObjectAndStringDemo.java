
public class ObjectAndStringDemo {

	public static void main(String[] args) {
		
		long a = 100;
		Long b = Long.valueOf(a);
		System.out.println("Long b "+b);
		String c = b.toString();
		System.out.println("String c "+c);
		Long d = Long.valueOf(c);
		System.out.println("Long d "+c);
	}
}
