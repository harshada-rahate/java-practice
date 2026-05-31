package sorting;



public class Developer implements Comparable <Developer> 
{
	private int id;
	private String name;
	private Double salary;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	
	}
	@Override
	public int compareTo(Developer o) 
	{
		// TODO Auto-generated method stub
		return (int)(this.salary-o.salary);
	}
	
	
		
	

}
