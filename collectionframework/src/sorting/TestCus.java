
package sorting;


import java.util.Set;
import java.util.TreeSet;

public class TestCus {
 public static void main(String [] args)
	{
		Set<Customer> c=new TreeSet<>();
		Customer c1=new Customer (1,"abc",3333333333l);
		Customer c2=new Customer (3,"xyz",2222222222l);
		Customer c3=new Customer (2,"pqr",1111111111l);
		
		c.add(c1);
		c.add(c2);
		c.add(c3);
		
	for(Customer cus:c) {
	 System.out.println(cus.cid);
	 System.out.println(cus.cname);
	 System.out.println(cus.mobno);
	}
	}

}
