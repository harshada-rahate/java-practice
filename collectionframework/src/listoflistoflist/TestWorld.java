package listoflistoflist;
import java.util.ArrayList;
import java.util.List;

public class TestWorld {


	public static void main(String [] args)
	{
		List<String>mh=new ArrayList<>();
		mh.add("Pune");
		mh.add("Mumbai");
	
		List<String>mp=new ArrayList<>();
		mp.add("Bhopal");
		mp.add("indore");
		
		List<String>State1=new ArrayList<>();
		State1.add("city1");
		State1.add("city2");
	
		List<String>State2=new ArrayList<>();
		State2.add("city1");
		State2.add("city2");
	
	
	
	List<List<String>>India=new ArrayList<>();
	India.add(mh);
	India.add(mp);
	
	List<List<String>>Japan=new ArrayList<>();
	Japan.add(State1);
	Japan.add(State2);
	
	List<List<List<String>>> World=new ArrayList<>();
	World.add(India);
	World.add(Japan);
	
	for(List<List<String>>lls: World) 
	{
		
		for(List<String>list:lls)
		{
			for( String list1:list)
			{
				System.out.println(list1);
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	

}
