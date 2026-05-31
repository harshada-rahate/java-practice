package sorting;

public class Student implements Comparable<Student> {
	private int rollno;
	private String name;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String i) {
		this.name = i;
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.rollno-o.rollno;
	}

}
