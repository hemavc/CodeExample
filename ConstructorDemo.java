
class Student1 {

	int regNo;
	String name;
	String branch;

	public Student1() {
		System.out.println("Default Constructor");
	}
	public Student1(int rNo, String sname, String sbranch) {
		regNo = rNo;
		name = sname;
		branch = sbranch;
	}

	void read() {
		regNo = 111;
		name = "Hema";
		branch = "CS";
	}

	void display() {
		System.out.println("Reg No : " + regNo);
		System.out.println("Name : " + name);
		System.out.println("Branch : " + branch);
	}
}

public class ConstructorDemo {

	public static void main(String[] args) {
		Student1 stud1=new Student1();
		Student1 stud2=new Student1(112,"Nagaraj","ECE");
		
		System.out.println("\nStudent1 Details");
		stud1.read();
		stud1.display();
		
		System.out.println("\nStudent2 Details");
		stud2.display();
	}

}
