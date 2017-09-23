
public class PrimitiveAndObjectDemo {

	public static void main(String[] args) {
		
		int a = 100;
		Integer b = Integer.valueOf(a);
		System.out.println("Integer b "+b);
		int c = b.intValue();
		System.out.println("int c "+c);
	}
}
