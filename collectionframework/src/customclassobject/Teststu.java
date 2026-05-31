package customclassobject;
import java.util.*;
public class Teststu {
 
	public static void main(String [] args)
	{
		List<Student>s=new ArrayList<>();
		
		Student s1=new Student();
		s1.setRollno(1);
		s1.setName("abc");
		s1.setAddress("pune");
		s1.setMobileno(5599993939l);
	    s1.setClgfees(50000);
	    s1.setMarks(95.4f);
	    s1.setClgname("sihgad collge");
	    
	    s.add(s1);
	    
	    Student s2=new Student();
		s2.setRollno(2);
		s2.setName("pqr");
		s2.setAddress("pune");
		s2.setMobileno(566778600l);
	    s2.setClgfees(50000);
	    s2.setMarks(91.4f);
	    s2.setClgname("sihgad collge");
	    
	    s.add(s2);
	    
	    Student s3=new Student();
		s3.setRollno(3);
		s3.setName("xyz");
		s3.setAddress("pune");
		s3.setMobileno(5599993939l);
	    s3.setClgfees(50000);
	    s3.setMarks(89.4f);
	    s3.setClgname("sihgad collge");
	    
	    s.add(s3);
	    
	    
	    for(Student ss:s)
	    {
	    	System.out.println(ss.getRollno());
	    	System.out.println(ss.getName());
	    	System.out.println(ss.getAddress());
	    	System.out.println(ss.getMobileno());
	    	System.out.println(ss.getClgfees());
	    	System.out.println(ss.getMarks());
	    	System.out.println(ss.getClgname());
	    }
	    
	}
	
}
