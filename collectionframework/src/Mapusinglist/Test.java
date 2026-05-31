package Mapusinglist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
public static void main(String [] args)
{
	List<String>mh=new ArrayList<>();
	mh.add("pune");
	mh.add("mumbai");
	mh.add("Nagpur");
	
	List<String>jh=new ArrayList<>();
	jh.add("Ranchi");
	jh.add("Lohardaga");
	jh.add("Nagpur");
	
	
	Map<String,List<String>>india=new HashMap<String,List<String>>();
	india.put("jharkhand", jh);
	india.put("Maharashtra", jh);
	
	india.forEach((sname,list)->{System.out.println(sname);
		list.forEach((city)->System.out.println(city));	

});
}}