package sorting;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
public class TestD {
	public static void main(String [] args)
	{
		Set<Developer> d=new TreeSet<>();
		Developer d1=new Developer();
		
		d1.setId(1);
		d1.setName("abc");
		d1.setSalary(40000);
		
Developer d2=new Developer();
		
		d2.setId(3);
		d2.setName("xyz");
		d2.setSalary(50000);
		
Developer d3=new Developer();
		
		d3.setId(2);
		d3.setName("abc");
		d3.setSalary(30000);
		
d.add(d1);
d.add(d2);
d.add(d3);
		
	d.forEach(dev->System.out.println(dev.getId()+"  "+dev.getName()+dev.getSalary()));	
		
		
	}

}
