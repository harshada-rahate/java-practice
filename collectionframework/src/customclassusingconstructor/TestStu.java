package customclassusingconstructor;

import java.util.ArrayList;
import java.util.List;



public class TestStu {
	public static void main(String [] args)
	{
		
		List<Student>al=new ArrayList<>();
		
		Student s1= new Student(1,"abc","pune",988776654l,98.5f,56000,"sihgad");
		al.add(s1);

		Student s2= new Student(2,"pqr","pune",988776654l,93.5f,56000,"sihgad");
		al.add(s2);

		
		
		for(Student stu:al)
		{
			System.out.println(stu. rollno);
			System.out.println(stu. name);
			System.out.println(stu. address);
			System.out.println(stu.mobileno );
			System.out.println(stu.mobileno );
			System.out.println(stu.clgfees );
			System.out.println(stu.marks );
			System.out.println(stu.clgname );
			
			
		}
		
	}
}


