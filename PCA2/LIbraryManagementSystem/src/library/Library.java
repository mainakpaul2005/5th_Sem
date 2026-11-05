package library;

import humans.Student;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private final List<Book> books = new ArrayList<>();
    private final List<Student> students = new ArrayList<>();
    private final List<Loan> loans = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void registerStudent(Student student) {
        students.add(student);
    }

    public Book findBook(int id) {
        for (Book book : books) {
            if (book.getBookId() == id) {
                return book;
            }
        }
        return null;
    }

    public Student findStudent(int id) {
        for (Student student : students) {
            if (student.getLibraryId() == id) {
                return student;
            }
        }
        return null;
    }

    public Loan issueBook(int bookId, int studentId) {
        Book book = findBook(bookId);
        Student student = findStudent(studentId);

        if (book == null || !book.isAvailable() || student == null) {
            return null;
        }

        book.borrow();
        Loan loan = new Loan(book, student);
        loans.add(loan);
        return loan;
    }

    public long returnBook(int bookId, int studentId) {
        for (Loan loan : loans) {
            if (loan.getBook().getBookId() == bookId
                    && loan.getStudent().getLibraryId() == studentId
                    && !loan.isReturned()) {
                loan.close();
                return loan.calculateFine();
            }
        }
        return 0;
    }

    public List<Book> getAvailableBooks() {
        List<Book> availableBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.isAvailable()) {
                availableBooks.add(book);
            }
        }
        return availableBooks;
    }

    public List<Book> searchByTitle(String title) {
        List<Book> result = new ArrayList<>();
        String query = title.toLowerCase();
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(query)) {
                result.add(book);
            }
        }
        return result;
    }
}
