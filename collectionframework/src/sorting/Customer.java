package sorting;

public class Customer implements Comparable <Customer> 
{
String cname;
int cid;
long mobno;

	
	public Customer(int cid,String cname,long mobno)
	{
		this.cid=cid;
		this.cname=cname;
		this.mobno=mobno;
		
	}


	@Override
	public int compareTo(Customer o) {
		// TODO Auto-generated method stub
		return this.cid-o.cid;
				
	}	
	
}