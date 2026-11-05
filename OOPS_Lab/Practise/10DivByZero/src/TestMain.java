
public class TestMain {

	public static void main(String[] args) {
		try {
			int c = 5 /0;
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}

}
