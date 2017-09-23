
public class WrapperConstructors {

	public static void main(String[] args) {
		
		long a = 1000;
		Long b = new Long(a);
		System.out.println("Long b "+b);
		String c = "1000";
		Long d = new Long(c);
		System.out.println("String d "+b);
	}

}
