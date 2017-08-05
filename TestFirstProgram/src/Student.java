
public class Student {

	/*
	 * private int roll_no; private String name;
	 * 
	 * public void setRoll_No(int roll_no) { this.roll_no = roll_no; }
	 * 
	 * public int getRoll_No() { return this.roll_no; }
	 * 
	 * public void setName(String name) { this.name = name; }
	 * 
	 * public String getName() { return this.name; }
	 */
	int roll_no;
	String name;

	public Student(int roll_no, String name) {
		this.roll_no = roll_no;
		this.name = name;
	}

	public void displayInformation() {
		System.out.println("Roll NO of Student=" + roll_no +"  "+ "Name Of Student=" + name);
	}
}

class TestStudent {
	public static void main(String args[]) {
		/*Student student = new Student(101, "Mohit");*/
		/*
		 * student.roll_no=101; student.name="Ajay Kumar";
		 */

		new Student(101, "Mohit").displayInformation();

	}
}
