
public class CommandArgumentsDemo {

	public static void main(String[] args) {

		int length = args.length;
		
		if(length==0) {
			System.out.println("No arguments");
		}else {
			System.out.println("All arguments");
			for (int i = 0; i < length; i++) {
				System.out.println("arguments["+i+"]: "+args[i]);
			}
		}
	}

}
