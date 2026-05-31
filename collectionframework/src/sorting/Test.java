package sorting;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Test {
public static void main(String [] args)
{
	List<Integer>al=new ArrayList<>();
	al.add(5);
    al.add(10);
    al.add(5);
    al.add(10);
    al.add(4);
  //System.out.println(al)  ;//order chnage
  
  //remove duplicate element
  
  Set<Integer>s=new LinkedHashSet(al);
  System.out.println(s);//order not change
    
}

}
