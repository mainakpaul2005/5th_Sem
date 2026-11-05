package library;
public class IssueRecord {
    int studentId, bookId;
    int day, month, year;

    IssueRecord(int studentId, int bookId,
            int day, int month, int year) {
        this.studentId = studentId;
        this.bookId = bookId;
        this.day = day;
        this.month = month;
        this.year = year;
    }
}