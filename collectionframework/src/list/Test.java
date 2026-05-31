package list;
import java.util.*;
public class Test
{
public static void main(String [] args)
{
	List<Integer>al=new ArrayList<>();
	
	al.add(10);
	al.add(20);
	al.add(30);
	al.add(10);
	//System.out.println(al);
	
	 int x = al.get(1);
	
	System.out.println(x);
}
}
