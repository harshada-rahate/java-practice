package customclassobject;
import java.util.*;
public class Testem {
	
	public static void main (String [] args)
	{
	List<Employee>al=new ArrayList<>();
	
	Employee e1=new Employee();
	e1.SetId(101);
	e1.SetName("abc");
	e1.SetSalary(2000.4f);
	
	al.add(e1);
	
	Employee e2=new Employee();
	e2.SetId(101);
	e2.SetName("abc");
	e2.SetSalary(2000.4f);
	
	al.add(e2);
	
	for (Employee emp1 :al)
	{
		System.out.println(emp1.getId());
		System.out.println(emp1.getName());
		System.out.println(emp1.getSalary());
	}
	}
	
	
	
	

}
