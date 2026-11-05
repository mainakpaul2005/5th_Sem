package library;
public class Student {
    int id;
    String name;
    String department;

    Student(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    void display() {
        System.out.println(id + "\t" + name + "\t" + department);
    }
}
