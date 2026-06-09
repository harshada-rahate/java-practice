package com.braindata.bankmanagement.model;

public class Account {
	private int accNO;
	private String name;
	private long mobNo;
	private long adharNo;
	private String gender;
	private int age;
	private double balance;


public void setAccNO(int accNo)
{
	this.accNO=accNo;
}
public void setName(String name)
{
	this.name=name;
}
public void setMobNo(long mobNo)
{
	this.mobNo=mobNo;
}
public void setAdharNo(long adharNo)
{
	this.adharNo=adharNo;
}
public void setGender(String gender)
{
	this.gender=gender;
}
public void setAge(int age)
{
	this.age= age;
}
public void setBalance(double balance)
{
	this.balance=balance;
}
  public int getAccNo()
{
	return accNO;
}
  public String getName()
{
	return name;
}
  public long getMobNo()
  {
	return mobNo;
} 
  public long getAdharNo()
  {
	return adharNo;
} 
  public String getGender()
  {
	return gender;
} 
  public int getAge()
  {
	return age;
} 
  public double getBalance()
  {
	return balance;
} 















}