package management;

import library.Book;
import humans.Student;

public class Return {
    private final Book book;
    private final Student student;

    public Return(Book book, Student student) {
        this.book = book;
        this.student = student;
    }

    public Book getBook() {
        return book;
    }

    public Student getStudent() {
        return student;
    }
}
