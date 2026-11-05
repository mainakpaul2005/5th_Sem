
public class Student {
	int rollNo;
	String name;
	String course;
	int[] marks = new int[5];
	
	public Student(int rollNo, String name, String course, int[] marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.course = course;
		this.marks = marks;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	

}
