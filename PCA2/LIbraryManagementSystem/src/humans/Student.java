package humans;

public class Student extends Person {
    private int rollNo;
    private int libraryId;

    public Student(String name, String address, int age, int rollNo, int libraryId) {
        super(name, address, age);
        this.rollNo = rollNo;
        this.libraryId = libraryId;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getLibraryId() {
        return libraryId;
    }

    public void setLibraryId(int libraryId) {
        this.libraryId = libraryId;
    }
}
