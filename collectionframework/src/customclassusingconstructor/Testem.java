package customclassusingconstructor;
import java.util.ArrayList;
import java.util.List;
public class Testem {
	
	public static void main(String [] args)
	{
		List<Employee> al=new ArrayList<>();
		
		Employee e1=new Employee( 1,"ABC",60000, "pune",9881277531l,"karve nagar","female" ); 
		al.add(e1);
		
		Employee e2=new Employee( 2,"PQR",60000, "pune",9881277531l,"Nanded city","female" ); 
	    al.add(e2);
	    
	   for(Employee ee:al)
	   {
		   
		
				System.out.println(ee.id);
				System.out.println(ee. ename);
				System.out.println(ee. addr);
				System.out.println(ee.esalary );
				System.out.println(ee.mb );
	
				System.out.println(ee.designation );
				System.out.println(ee. gender);
				
				
				
			
	   }
	}

}
