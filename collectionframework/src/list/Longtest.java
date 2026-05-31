package list;


import java.util.ArrayList;
import java.util.List;

public class Longtest {
	public static void main (String [] args)
	{
		List<Long>al=new ArrayList<>();
	
	al.add (4567896788l);
	al.add(87764665555l);
	//System.out.println(al);

for (long l: al)
{
	System.out.println(l);
}

}
}