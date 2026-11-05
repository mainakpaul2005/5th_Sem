
import java.util.Scanner;
public class TestMain {
    private static final Scanner IN = new Scanner(System.in);
    private static Student student;
    private static Book book;
    private static IssueRecord issue;
    public static void main(String[] args) {
        int choice;
        do {
            menu();
            choice = number("Choice: ");
            switch (choice) {
                case 1 -> addStudent();
                case 2 -> addBook();
                case 3 -> show(student, "No student found!");
                case 4 -> show(book, "No book found!");
                case 5 -> issueBook();
                case 6 -> fine();
                case 7 -> returnBook();
                case 8 -> System.out.println("Thank you!");
                default -> System.out.println("Invalid choice!");
            }
        } while (choice != 8);
    }
    private static void menu() {
        System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====\n1. Add Student\n2. Add Book\n"
                + "3. Display Student\n4. Display Book\n5. Issue Book\n6. Check Fine\n"
                + "7. Return Book\n8. Exit");
    }
    private static void addStudent() {
        if (student != null) { System.out.println("Student already exists!"); return; }
        student = new Student(number("Student ID: "), text("Name: "), text("Department: "));
        System.out.println("Student added successfully!");
    }
    private static void addBook() {
        if (book != null) { System.out.println("Book already exists!"); return; }
        book = new Book(number("Book ID: "), text("Title: "), text("Author: "));
        System.out.println("Book added successfully!");
    }
    private static void show(Object item, String message) {
        if (item == null) System.out.println(message);
        else if (item instanceof Student) student.display();
        else book.display();
    }
    private static void issueBook() {
        if (student == null || book == null) {
            System.out.println("Add student and book first!"); return;
        }
        if (!book.available) { System.out.println("Book already issued!"); return; }
        if (number("Student ID: ") != student.id || number("Book ID: ") != book.id) {
            System.out.println("Invalid ID!"); return;
        }
        int[] d = date("Issue date (day month year): ");
        if (d == null) return;
        issue = new IssueRecord(student.id, book.id, d[0], d[1], d[2]);
        book.available = false;
        System.out.println("Book issued successfully!");
    }
    private static void fine() {
        if (issue == null) { System.out.println("No issued book!"); return; }
        int[] d = date("Current date (day month year): ");
        if (d == null) return;
        int days = daysSinceIssue(d);
        if (days < 0) System.out.println("Invalid date!");
        else System.out.println("\nDays Kept: " + days + "\nAllowed Days: 30\nFine: Rs. " + FineCalculator.calculateFine(days));
    }
    private static void returnBook() {
        if (issue == null) { System.out.println("No issued book!"); return; }
        int[] d = date("Return date (day month year): ");
        if (d == null) return;
        int days = daysSinceIssue(d);
        if (days < 0) { System.out.println("Invalid return date!"); return; }
        System.out.println("Days Kept: " + days + "\nFine: Rs. "
                + FineCalculator.calculateFine(days));
        book.available = true; issue = null;
        System.out.println("Book returned successfully!");
    }
    private static int daysSinceIssue(int[] d) {
        return FineCalculator.calculateDays(issue.day, issue.month, issue.year, d[0], d[1], d[2]);
    }
    private static int[] date(String prompt) {
        String[] p = text(prompt).trim().split("\\s+");
        if (p.length != 3) { System.out.println("Enter day, month, and year."); return null; }
        try {
            int day = Integer.parseInt(p[0]), month = Integer.parseInt(p[1]);
            int year = Integer.parseInt(p[2]);
            if (day < 1 || day > 30 || month < 1 || month > 12 || year < 1)
                throw new NumberFormatException();
            return new int[]{day, month, year};
        } catch (NumberFormatException e) { System.out.println("Invalid date!"); return null; }
    }
    private static int number(String prompt) {
        while (true) try { return Integer.parseInt(text(prompt).trim()); }
        catch (NumberFormatException e) { System.out.println("Enter a valid number."); }
    }
    private static String text(String prompt) {
        System.out.print(prompt); return IN.nextLine();
    }
}
