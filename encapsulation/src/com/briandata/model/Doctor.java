package com.briandata.model;

public class Doctor {
	protected int did;
	protected String dname;
	protected String dhospitalname;
	protected String haddress;
	protected long dmobno;
   protected double salary;
public int getDid() {
	return did;
}
public void setDid(int did) {
	this.did = did;
}
public String getDname() {
	return dname;
}
public void setDname(String dname) {
	this.dname = dname;
}
public String getDhospitalname() {
	return dhospitalname;
}
public void setDhospitalname(String dhospitalname) {
	this.dhospitalname = dhospitalname;
}
public String getHaddress() {
	return haddress;
}
public void setHaddress(String haddress) {
	this.haddress = haddress;
}
public long getDmobno() {
	return dmobno;
}
public void setDmobno(long dmobno) {
	this.dmobno = dmobno;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
   
}

