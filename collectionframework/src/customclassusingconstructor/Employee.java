package customclassusingconstructor;

public class Employee {
	 int id;
    String ename;
	 double esalary;
	 String addr;
	 long mb;
	 String designation;
	 String gender;
	
	public Employee(int id,String ename, double esalary,String addr,long mb,String designation,String gender)
	{
		this.id=id;
		this.ename=ename;
		this.esalary=esalary;
		this.addr=addr;
		this.mb=mb;
		this.designation=designation;
		this.gender=gender;
		
	}
}