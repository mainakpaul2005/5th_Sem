import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args)
    {
        int num1, num2;
        int ch = 0;
        Scanner sc = new Scanner(System.in);
        int res1;
        float res2;

        while(true)
        {
            System.out.println("====Menu====\n1.Add\n2.Subtract\n3.Multiply\n4.Divide\n5.Remainder\n6.Exit");
            ch = sc.nextInt();

            switch(ch)
            {
                case 1:
                    System.out.print("Enter First Number: ");
                    num1 = sc.nextInt();
                    System.out.print("Enter Second Number: ");
                    num2 = sc.nextInt();
                    res1 = num1 + num2;
                    System.out.println("The Result is: "+res1);
                    break;
                case 2:
                    System.out.print("Enter First Number: ");
                    num1 = sc.nextInt();
                    System.out.print("Enter Second Number: ");
                    num2 = sc.nextInt();
                    res1 = num1 - num2;
                    System.out.println("The Result is: "+res1);
                    break;
                case 3:
                    System.out.print("Enter First Number: ");
                    num1 = sc.nextInt();
                    System.out.print("Enter Second Number: ");
                    num2 = sc.nextInt();
                    res1 = num1 * num2;
                    System.out.println("The Result is: "+res1);
                    break;
                case 4:
                    System.out.print("Enter First Number: ");
                    num1 = sc.nextInt();
                    System.out.print("Enter Second Number: ");
                    num2 = sc.nextInt();
                    res2 = num1 / num2;
                    System.out.println("The Result is: "+res2);
                    break;
                case 5:
                    System.out.print("Enter First Number: ");
                    num1 = sc.nextInt();
                    System.out.print("Enter Second Number: ");
                    num2 = sc.nextInt();
                    res1 = num1 % num1;
                    System.out.println("The Result is: "+res1);
                    break;
                case 6:
                    System.out.println("Exiting!!!");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid Input !! Check Carefully and enter again..");
            }

        }
    }
}