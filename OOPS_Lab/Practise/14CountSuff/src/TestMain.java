import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a paragraph:");
		String str = sc.nextLine();

		int words = 0, symbols = 0, sentences = 0;

		String[] arr = str.trim().split(" ");
		words = str.trim().isEmpty() ? 0 : arr.length;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
				if (ch != '.' && ch != '?' && ch != '!') {
					symbols++;
				}
			}

			if (ch == '.' || ch == '?' || ch == '!') {
				sentences++;
			}
		}

		System.out.println("Words: " + words);
		System.out.println("Special symbols: " + symbols);
		System.out.println("Sentences: " + sentences);

		sc.close();
	}
}