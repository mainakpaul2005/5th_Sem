import java.util.Scanner;

public class LeapYear{
    public static void main(String[] args) {
        int year;

        Scanner sc =  new Scanner(System.in);

        System.out.print("Enter a Year: ");
        year = sc.nextInt();

        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.println(year+" is a Leap Year.");
                }
                else{
                    System.out.println(year+" is not a Leap Year.");
                }
            }
            else{
                System.out.println(year+" is not a Leap Year.");
            }
        }
        else{
            System.out.println(year + " is a Leap Year.");        
        }
        sc.close();
    }
}
