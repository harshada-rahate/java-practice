package sortingusingcomparator;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String []  args)
	{
		Set<Student>s=null;
		Scanner sc=new Scanner(System.in);
	
	System.out.println("----Select----\n"
			           +"Rollno sort\n"                        
			          +"Name sort\n"    );
	
	int ch=sc.nextInt();
	if (ch==1)
	{
		Comparator<Student>rnsort=Comparator.comparingInt (Student::getRollno);
		s=new TreeSet<>(rnsort);
		
		
	}
	else if(ch==2)
	{
		Comparator<Student>nmsort=Comparator.comparing (Student::getName);
		s=new TreeSet<>(nmsort);
		
		
	}
	Student s1=new Student();
	s1.setRollno(1);
	s1.setName("bbb");
	
	Student s2=new Student();
	s2.setRollno(2);
	s2.setName("aaa");
	
	Student s3=new Student();
	s3.setRollno(3);
	s3.setName("ccc");
	
	s.add(s1);
	s.add(s2);
	s.add(s3);
	s.forEach((stu)->System.out.println(stu.getRollno()+""+stu.getName()));
	
	
	
}

}
