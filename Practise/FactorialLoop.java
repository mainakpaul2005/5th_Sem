import java.util.Scanner;

public class FactorialLoop
{
    public static void main(String[] args) 
    {
        int num, i;
        int fact = 1;
        Scanner sc =  new Scanner(System.in);

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        for(i = 2; i <= num; i++)
        {
            fact *= i;
        }

        System.out.println("The Factorial of "+num+" is: "+fact);
        sc.close();
    }
}