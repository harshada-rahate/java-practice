package com.briandata.client;
import com.briandata.model.Doctor;
public class DoctorTest {
	public static void main(String [] args)
	{
		
	
	Doctor d=new Doctor();
	d.setDid(1);
	d.setDname("xyz");
	d.setDhospitalname("a b c hospital");
	d.setHaddress("pqr hospital in pune");
	d.setDmobno(4848585959l);	
	d.setSalary(100000);
	
	System.out.println(d.getDid());
	System.out.println(d.getDname());
	System.out.println(d.getDhospitalname());
	System.out.println(d.getHaddress());
	System.out.println(d.getDmobno());
	System.out.println(d.getSalary());




}
}