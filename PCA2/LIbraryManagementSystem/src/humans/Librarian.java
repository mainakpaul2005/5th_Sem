package humans;

public class Librarian extends Person {
    private int libraryId;

    public Librarian(String name, String address, int age, int libraryId) {
        super(name, address, age);
        this.libraryId = libraryId;
    }

    public int getLibraryId() {
        return libraryId;
    }

    public void setLibraryId(int libraryId) {
        this.libraryId = libraryId;
    }
}
