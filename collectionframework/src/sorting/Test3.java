package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test3 {
	public static void main(String [] args)
	{
		List<Integer>al=new ArrayList<>();
		al.add(5);
	    al.add(10);
	    al.add(5);
	    al.add(10);
	    al.add(4);
	  System.out.println(al);
	  Collections.sort(al);
	  System.out.println(al);

}
}