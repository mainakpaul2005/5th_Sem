package library;

import humans.Student;
import java.time.LocalDate;

public class Loan {
    public static final int LOAN_PERIOD_DAYS = 14;
    public static final long DAILY_FINE = Fine.DAILY_RATE;

    private final Book book;
    private final Student student;
    private final LocalDate issueDate;
    private final LocalDate dueDate;
    private LocalDate returnDate;

    public Loan(Book book, Student student) {
        this(book, student, LocalDate.now());
    }

    public Loan(Book book, Student student, LocalDate issueDate) {
        if (book == null || student == null || issueDate == null) {
            throw new IllegalArgumentException("Book, student, and issue date are required");
        }
        this.book = book;
        this.student = student;
        this.issueDate = issueDate;
        this.dueDate = issueDate.plusDays(LOAN_PERIOD_DAYS);
    }

    public Book getBook() {
        return book;
    }

    public Student getStudent() {
        return student;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public boolean isReturned() {
        return returnDate != null;
    }

    public boolean isOverdue() {
        return currentDate().isAfter(dueDate);
    }

    public void close() {
        if (isReturned()) {
            throw new IllegalStateException("Loan has already been returned");
        }
        book.returnBook();
        returnDate = LocalDate.now();
    }

    public long calculateFine() {
        return new Fine(dueDate, currentDate()).getAmount();
    }

    private LocalDate currentDate() {
        return isReturned() ? returnDate : LocalDate.now();
    }

    @Override
    public String toString() {
        return book.getTitle() + " borrowed by " + student.getName();
    }
}
