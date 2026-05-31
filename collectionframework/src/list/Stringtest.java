package list;

import java.util.ArrayList;
import java.util.List;

public class Stringtest {

	public static void main(String [] args)
	{
		List<String>al=new ArrayList<>();
		
		al.add("aa");
		al.add("bbb");
		al.add("cc");
		al.add("ddd");
		//System.out.println(al);
		
		for(String s:al)
		{
		System.out.println(s);
	}
	
}
}