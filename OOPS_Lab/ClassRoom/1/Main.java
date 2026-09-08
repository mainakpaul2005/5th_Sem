import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int ch;
        float res;
        float n1, n2, n3, n4;

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter:\n1. Add two nums\n2. Add three nums\n3. Add four nums\n4. Mul two nums\n5. Mul three nums\n6. Mul four nums\n7. Exit");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter first number: ");
                    n1 = sc.nextFloat();
                    System.out.print("Enter second number: ");
                    n2 = sc.nextFloat();
                    Calculator c1 = new Calculator(n1, n2);
                    res = c1.addNums(n1, n2);
                    System.out.println("The Result: " + res);
                    break;
                case 2:
                    System.out.print("Enter first number: ");
                    n1 = sc.nextFloat();
                    System.out.print("Enter second number: ");
                    n2 = sc.nextFloat();
                    System.out.print("Enter third number: ");
                    n3 = sc.nextFloat();
                    Calculator c2 = new Calculator(n1, n2, n3);
                    res = c2.addNums(n1, n2, n3);
                    System.out.println("The Result: " + res);
                    break;
                case 3:
                    System.out.print("Enter first number: ");
                    n1 = sc.nextFloat();
                    System.out.print("Enter second number: ");
                    n2 = sc.nextFloat();
                    System.out.print("Enter third number: ");
                    n3 = sc.nextFloat();
                    System.out.print("Enter fourth number: ");
                    n4 = sc.nextFloat();
                    Calculator c3 = new Calculator(n1, n2, n3, n4);
                    res = c3.addNums(n1, n2, n3, n4);
                    System.out.println("The Result: " + res);
                    break;
                case 4:
                    System.out.print("Enter first number: ");
                    n1 = sc.nextFloat();
                    System.out.print("Enter second number: ");
                    n2 = sc.nextFloat();
                    Calculator c4 = new Calculator(n1, n2);
                    res = c4.mulNums(n1, n2);
                    System.out.println("The Result: " + res);
                    break;
                case 5:
                    System.out.print("Enter first number: ");
                    n1 = sc.nextFloat();
                    System.out.print("Enter second number: ");
                    n2 = sc.nextFloat();
                    System.out.print("Enter third number: ");
                    n3 = sc.nextFloat();
                    Calculator c5 = new Calculator(n1, n2, n3);
                    res = c5.mulNums(n1, n2, n3);
                    System.out.println("The Result: " + res);
                    break;
                case 6:
                    System.out.print("Enter first number: ");
                    n1 = sc.nextFloat();
                    System.out.print("Enter second number: ");
                    n2 = sc.nextFloat();
                    System.out.print("Enter third number: ");
                    n3 = sc.nextFloat();
                    System.out.print("Enter fourth number: ");
                    n4 = sc.nextFloat();
                    Calculator c6 = new Calculator(n1, n2, n3, n4);
                    res = c6.mulNums(n1, n2, n3, n4);
                    System.out.println("The Result: " + res);
                    break;
                case 7:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice Enter Carefully!!");
            }
        }
    }
}
