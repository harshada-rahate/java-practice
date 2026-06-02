package com.cjc.model;
import com.cjc.client.Laptop;
public class Test {
public static void main(String [] args)
{
	Laptop l=new Laptop();
	l.setModelno(5);
	l.setLname("Asus");
	l.setLprize(50000);
	
	System.out.println(l.getModelno());
	System.out.println(l.getLname());
     System.out.println(l.Lprize());
}
}