package org.brainsdata.impl;
import org.braindata.model.Student;
public class Display extends Student
{
	public void studentfirst()
	{
	Display d=new Display()	;
	 d.setRollno(101);
	 d.setName("xyz");
	 d.setMobno(58348495900l);
	 d.setFees(68000);
	 d.setAddress("pune");
	 d.setClgname("jspm college pune");
	 System.out.println(d.getRollno());
		System.out.println(d.getName());
		System.out.println(d.getMobno());
		System.out.println(d.getFees());
		System.out.println(d.getRollno());
		System.out.println(d.getAddress());
		System.out.println(d.getClgname());
	}

	public void studentsecond()
	{
	Display d1=new Display();	
	 d1.setRollno(102);
	 d1.setName("pqr");
	 d1.setMobno(598483493l);
	 
	 d1.setFees(78000);
	 d1.setAddress("pune");
	 d1.setClgname("sihgad college pune");
	
	System.out.println(d1.getRollno());
	System.out.println(d1.getName());
	System.out.println(d1.getMobno());
	System.out.println(d1.getFees());
	System.out.println(d1.getRollno());
	System.out.println(d1.getAddress());
	System.out.println(d1.getClgname());
}
}
