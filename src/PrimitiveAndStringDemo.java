
public class PrimitiveAndStringDemo {

	public static void main(String[] args) {
		
		byte a = 100;
		String b = Byte.toString(a);
		System.out.println("String b "+b);
		byte c = Byte.parseByte(b);
		System.out.println("byte c "+c);
	}
}
