import java.util.Scanner;


public class TestMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;

		System.out.print("Enter Name:");
		name = sc.nextLine();

		if(name.toLowerCase().charAt(0)== 'a') {
			BasicCalc c = new BasicCalc();
			System.out.println(c.addNum(10,20));
			System.out.println(c.subNum(20,10));
		}
		if(name.toLowerCase().charAt(0) == 's') {
			ScientificCalc s = new ScientificCalc();
			System.out.println(s.log(2.71828999));
		}
		else {
			BasicCalc c = new BasicCalc();
			System.out.println(c.addNum(20,10));
		}
		
		sc.close();
	}
}
