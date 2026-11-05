
public class TestMain {
	public static void validateAge(int age) throws UDFException {
        if (age < 18) {
            throw new UDFException("Age must be at least 18.");
        }
        System.out.println("Access granted.");
    }

    public static void main(String[] args) {
        try {
            validateAge(15);
        } catch (UDFException e) {
            System.out.println(e.getMessage());
        }
    }
}
