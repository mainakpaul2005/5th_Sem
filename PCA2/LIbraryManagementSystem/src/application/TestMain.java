package application;

import humans.Student;
import java.util.NoSuchElementException;
import java.util.Scanner;
import library.Book;
import library.Library;

public final class TestMain {
    
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            printMenu();
            String choice = scanner.nextLine();

            try {
                switch (choice) {
                    case "1":
                        addBook(scanner, library);
                        break;
                    case "2":
                        registerStudent(scanner, library);
                        break;
                    case "3":
                        issueBook(scanner, library);
                        break;
                    case "4":
                        returnBook(scanner, library);
                        break;
                    case "5":
                        showAvailableBooks(library);
                        break;
                    case "6":
                        searchBooks(scanner, library);
                        break;
                    case "7":
                        System.out.println("Goodbye.");
                        return;
                    default:
                        System.out.println("Invalid option.");
                }
            } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException exception) {
                System.out.println("Operation failed: " + exception.getMessage());
            }
        }
    }

    private static void printMenu() {
        System.out.println("\nLibrary Management System");
        System.out.println("1. Add book");
        System.out.println("2. Register student");
        System.out.println("3. Issue book");
        System.out.println("4. Return book");
        System.out.println("5. Show available books");
        System.out.println("6. Search books by title");
        System.out.println("7. Exit");
        System.out.print("Choose an option: ");
    }

    private static void addBook(Scanner scanner, Library library) {
        System.out.print("Book ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Title: ");
        String title = scanner.nextLine();
        System.out.print("Author: ");
        String author = scanner.nextLine();
        library.addBook(new Book(id, title, author));
        System.out.println("Book added.");
    }

    private static void registerStudent(Scanner scanner, Library library) {
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Address: ");
        String address = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        System.out.print("Roll number: ");
        int rollNo = scanner.nextInt();
        System.out.print("Library ID: ");
        int libraryId = scanner.nextInt();
        scanner.nextLine();
        library.registerStudent(new Student(name, address, age, rollNo, libraryId));
        System.out.println("Student registered.");
    }

    private static void issueBook(Scanner scanner, Library library) {
        System.out.print("Book ID: ");
        int bookId = scanner.nextInt();
        System.out.print("Student library ID: ");
        int studentId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Issued: " + library.issueBook(bookId, studentId));
    }

    private static void returnBook(Scanner scanner, Library library) {
        System.out.print("Book ID: ");
        int bookId = scanner.nextInt();
        System.out.print("Student library ID: ");
        int studentId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Book returned. Fine: " + library.returnBook(bookId, studentId));
    }

    private static void showAvailableBooks(Library library) {
        library.getAvailableBooks().forEach(System.out::println);
    }

    private static void searchBooks(Scanner scanner, Library library) {
        System.out.print("Title search: ");
        String query = scanner.nextLine();
        library.searchByTitle(query).forEach(System.out::println);
    }
}
