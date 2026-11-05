public class TestMain {
    public static void main(String[] args) {

        int[] marks1 = {85, 90, 78, 88, 92};
        int[] marks2 = {75, 80, 85, 70, 90};
        int[] marks3 = {90, 85, 95, 80, 88};

        Student s1 = new Student(101, "Rahul", "IT", marks1);
        Student s2 = new Student(102, "Amit", "IT", marks2);
        Student s3 = new Student(103, "Riya", "IT", marks3);

        Student[] students = {s1, s2, s3};

        String[] subjects = {
            "Java", "OS", "DBMS", "CN", "SE"
        };

        // Student-wise average
        System.out.println("Student-wise Average:");

        for (Student s : students) {
            int sum = 0;

            for (int m : s.getMarks()) {
                sum += m;
            }

            double avg = sum / 5.0;

            System.out.println(s.getName() + ": " + avg);
        }

        // Subject-wise average
        System.out.println("\nSubject-wise Average:");

        for (int i = 0; i < 5; i++) {
            int sum = 0;

            for (Student s : students) {
                sum += s.getMarks()[i];
            }

            double avg = sum / (double) students.length;

            System.out.println(subjects[i] + ": " + avg);
        }
    }
}