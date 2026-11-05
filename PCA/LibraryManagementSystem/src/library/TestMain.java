package library;
import java.util.Scanner;

public class TestMain {

    static Scanner sc = new Scanner(System.in);

    static Student student;
    static Book book;
    static IssueRecord record;

    static void addStudent() {

        if (student != null) {
            System.out.println("Student already exists!");
            return;
        }

        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Department: ");
        String dept = sc.nextLine();

        student = new Student(id, name, dept);

        System.out.println("Student added successfully!");
    }

    static void addBook() {

        if (book != null) {
            System.out.println("Book already exists!");
            return;
        }

        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Author: ");
        String author = sc.nextLine();

        book = new Book(id, title, author);

        System.out.println("Book added successfully!");
    }

    static void displayStudent() {

        if (student == null)
            System.out.println("No student found!");
        else
            student.display();
    }

    static void displayBook() {

        if (book == null)
            System.out.println("No book found!");
        else
            book.display();
    }

    static void issueBook() {

        if (student == null || book == null) {
            System.out.println("Add student and book first!");
            return;
        }

        if (!book.available) {
            System.out.println("Book already issued!");
            return;
        }

        System.out.print("Enter Student ID: ");
        int sid = sc.nextInt();

        System.out.print("Enter Book ID: ");
        int bid = sc.nextInt();

        if (sid != student.id || bid != book.id) {
            System.out.println("Invalid ID!");
            return;
        }

        System.out.print("Enter Issue Day, Month, Year: ");
        int d = sc.nextInt();
        int m = sc.nextInt();
        int y = sc.nextInt();

        if (d < 1 || d > 30 || m < 1 || m > 12 || y < 1) {
            System.out.println("Invalid date!");
            return;
        }

        record = new IssueRecord(sid, bid, d, m, y);

        book.available = false;

        System.out.println("Book issued successfully!");
    }

    static void checkFine() {

        if (record == null) {
            System.out.println("No issued book!");
            return;
        }

        System.out.print("Enter Current Day, Month, Year: ");
        int d = sc.nextInt();
        int m = sc.nextInt();
        int y = sc.nextInt();

        if (d < 1 || d > 30 || m < 1 || m > 12 || y < 1) {
            System.out.println("Invalid date!");
            return;
        }

        int days = FineCalculator.calculateDays(
                record.day, record.month, record.year,
                d, m, y);

        if (days < 0) {
            System.out.println("Invalid date!");
            return;
        }

        int fine = FineCalculator.calculateFine(days);

        System.out.println("\n--- FINE DETAILS ---");
        System.out.println("Days Kept: " + days);
        System.out.println("Allowed Days: 30");
        System.out.println("Fine: Rs. " + fine);
    }

    static void returnBook() {

        if (record == null) {
            System.out.println("No issued book!");
            return;
        }

        System.out.print("Enter Return Day, Month, Year: ");
        int d = sc.nextInt();
        int m = sc.nextInt();
        int y = sc.nextInt();

        if (d < 1 || d > 30 || m < 1 || m > 12 || y < 1) {
            System.out.println("Invalid date!");
            return;
        }

        int days = FineCalculator.calculateDays(
                record.day, record.month, record.year,
                d, m, y);

        if (days < 0) {
            System.out.println("Invalid return date!");
            return;
        }

        int fine = FineCalculator.calculateFine(days);

        System.out.println("\n--- RETURN DETAILS ---");
        System.out.println("Days Kept: " + days);
        System.out.println("Fine: Rs. " + fine);

        book.available = true;
        record = null;

        System.out.println("Book returned successfully!");
    }

    public static void main(String[] args) {

        int ch;

        do {
            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. Add Book");
            System.out.println("3. Display Student");
            System.out.println("4. Display Book");
            System.out.println("5. Issue Book");
            System.out.println("6. Check Fine");
            System.out.println("7. Return Book");
            System.out.println("8. Exit");

            System.out.print("Enter Choice: ");
            ch = sc.nextInt();

            switch (ch) {

                case 1:
                    addStudent();
                    break;

                case 2:
                    addBook();
                    break;

                case 3:
                    displayStudent();
                    break;

                case 4:
                    displayBook();
                    break;

                case 5:
                    issueBook();
                    break;

                case 6:
                    checkFine();
                    break;

                case 7:
                    returnBook();
                    break;

                case 8:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (ch != 8);

        sc.close();
    }
}
