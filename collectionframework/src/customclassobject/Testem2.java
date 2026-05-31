package customclassobject;

import java.util.ArrayList;
import java.util.List;

public class Testem2 {
public static void main (String [] args)
{
List<Employee2>al=new ArrayList<>();
	
	Employee2  e2=new Employee2();
	e2.setId(101);
	e2.setEname("abc");
	e2.setEsalary(2000.4f);
	e2.setAddr("pune");
	e2.setMb(7969050403l);
	e2.setDesignation("cjc");
	e2.setGender("female");
	al.add(e2);
	
	Employee2  e3=new Employee2();
	e3.setId(101);
	e3.setEname("abc");
	e3.setEsalary(2000.4f);
	e3.setAddr("pune");
	e3.setMb(7969050403l);
	e3.setDesignation("cjc");
	e3.setGender("female");
	al.add(e3);
	for(Employee2 ee:al) {
		System.out.println(ee.getId());
		System.out.println(ee.getEname());
		System.out.println(ee.getEsalary());
		System.out.println(ee.getAddr());
		System.out.println(ee.getMb());
		System.out.println(ee.getDesignation());
		System.out.println(ee.getGender());
		
	}
	
}
}
