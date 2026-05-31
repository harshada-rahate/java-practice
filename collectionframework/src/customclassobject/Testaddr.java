package customclassobject;

import java.util.ArrayList;

import java.util.List;

public class Testaddr {
	
	
	public static void main(String [] args)
	{
	
	
		
	
  Address a1= new Address();
   a1.setAreaname("cjc ");
   a1.setCityname("pune");
   
   Address a2= new Address();
   a2.setAreaname("cjc ");
   a2.setCityname("akurdi");
   
   Address a3= new Address();
   a3.setAreaname("cjc ");
   a3.setCityname("nanded city ");
   
   Address a4= new Address();
   a4.setAreaname("cjc ");
   a4.setCityname("karvenagar");
    
    
   Address a5= new Address();
   a5.setAreaname("cjc ");
   a5.setCityname("warje");
   
	
   Student1 s1=new Student1();
   
	  s1.setRollno(1); 
	  s1.setSname("abc");
	  s1.setGender("female");
	  s1.setMobno(8765544397l);
	  s1.setClgfees(70000);
	 s1.setAddr(a1);
	    
	    
	  Student1 s2=new Student1();
	   
	  s2.setRollno(2); 
	  s2.setSname("pqr");
	  s2.setGender("female");
	  s2.setMobno(8765544397l);
	  s2.setClgfees(70000);
	  s2.setAddr(a2);
	 
	  
	  Student1 s3=new Student1();
	   
	  s3.setRollno(3); 
	  s3.setSname("xyz");
	  s3.setGender("female");
	  s3.setMobno(8765544397l);
	  s3.setClgfees(70000);
	 s3.setAddr(a3);
	  
	  Student1 s4=new Student1();
	   
	  s4.setRollno(4); 
	  s4.setSname("uvw");
	  s4.setGender("female");
	  s4.setMobno(8765544397l);
	  s4.setClgfees(70000);
	  s4.setAddr(a4);
	 
	  
	  Student1 s5=new Student1();
	   
	  s5.setRollno(5); 
	  s5.setSname("abc");
	  s5.setGender("female");
	  s5.setMobno(8765544397l);
	  s5.setClgfees(70000);
	  s5.setAddr(a5);
	 
List<Student1>al1=new ArrayList<>();
al1.add(s1);
al1.add(s2);

al1.add(s3);

al1.add(s4);

al1.add(s5);

		
	  
	  for(Student1 ss:al1)
	  {
		  System.out.println(ss.getRollno());
		  System.out.println(ss.getSname());
		  System.out.println(ss.getGender());
		  System.out.println(ss.getMobno());
		  System.out.println(ss.getClgfees());
		  System.out.println(ss.getAddr().getAreaname());
		  System.out.println(ss.getAddr().getCityname());
		  System.out.println("**************************************************");
	  }  
		 
		
		  
		 
	  }
	  
}

