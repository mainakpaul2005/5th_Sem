import java.util.Scanner;
public class TestMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int i = 0;
		
		System.out.print("Enter name: ");
		name = sc.nextLine();
		
		String[] arr = name.trim().split(" ");
		
		
		for(i = 0; i < arr.length-1; i++) {
			System.out.print(arr[i].charAt(0)+".");
		}
		System.out.print(arr[arr.length-1]);
		
		sc.close();
	}

}
