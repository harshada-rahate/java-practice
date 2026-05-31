
package list;
import java.util.*;
public class list2 {
public static void main (String []args)
	
{
List<Integer>al=new ArrayList<>();
	
	al.add(10);
	al.add(20);
	al.add(30);
	al.add(10);
	//System.out.println(al);
	
	 int x = al.get(1);
	
	System.out.println(x);


List<String>a2=new ArrayList<>();
a2.add("abc");
a2.add("pqr");
a2.add("xyz");

String s = a2.get(1);

String s1 = a2.get(2);

System.out.println(s);
System.out.println(s1);


}
}

