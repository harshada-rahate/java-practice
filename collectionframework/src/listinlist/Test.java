package listinlist;
import java.util.*;
public class Test
{
	
	public static void main(String [] args)
	{
		List <String>mh= new ArrayList<>();
		
		mh.add("pune");
		mh.add("mumbai"); 
		mh.add("nagpur");
		mh.add("akola");
		
List <String>jh= new ArrayList<>();
		
		mh.add("Rachi");
		mh.add("Lohardarga"); 
		
	    List<List <String>>india= new ArrayList<>();	
		
		india .add(mh);
		india .add(jh);
		
		
	for (List<String>l:india)	
		
	{
		
		for(String city:l)
		{
			System.out.println(city);
		}
	}
		
		
		
		
		
		
		
		
		
		
	}

}
