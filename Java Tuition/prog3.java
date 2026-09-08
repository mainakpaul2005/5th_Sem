import java.util.Scanner;

public class prog3 {
    public static void main(String[] args) {
        int a, b, sum;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        a = sc.nextInt();
        System.out.print("Enter another number: ");
        b = sc.nextInt();
        sum = a + b;
        System.out.println("The Sum is: "+sum);
        sc.close();
    }    
}
