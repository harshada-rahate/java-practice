package customclassobject;

public class Student1 {
private int rollno;
private String sname;
private String gender;
private long mobno;
private double clgfees;
private Address addr;

  public void setRollno(int rollno)
{
	this.rollno=rollno;
}
public void setSname(String sname)
{
	this.sname=sname;
}
public void setGender(String gender)
{
	this.gender=gender;
}
public void setMobno(long mobno)
{
	this.mobno=mobno;
}

public void setClgfees(double clgfess)
{
this.clgfees=clgfees;	
}
public void setAddr(Address addr)
{
	this.addr=addr;
}
public int getRollno() {
	return rollno;
}
public String getSname()
{
	return sname;
}

public String getGender()
{
	return gender;
}
public long getMobno()
{
	return mobno;
}
public double getClgfees()
{
	return clgfees;
}

public Address getAddr()
{
	return addr;
}

	
}














