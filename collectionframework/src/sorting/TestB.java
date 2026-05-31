package sorting;

import java.util.Set;
import java.util.TreeSet;

public class TestB {
	
		public Set<Bank> SetDetails()
	{
		Person p=new Person();
		p.setPname("harshss");
		p.setPaddr("amt");
		p.setPmob(67584934939l);
		
		
		Account acc=new Account();
		acc.setAccno(56758);
		acc.setAcctype("Saving");
		
		acc.setP(p);
		
		Bank  b=new Bank();
		b.setBname("Sbi");
		b.setBranch("kothrud");
		b.setAddr("pune");
		b.setAcc(acc );
		
		Set<Bank>s=new TreeSet<>();
		s.add(b);
		return s;
				
	}
		public void getDetails(Set<Bank> x)
		{
			for(Bank b:x) 
			{
			System.out.println(b.getBname());
			System.out.println(b.getBranch());
			System.out.println(b.getAddr());
			System.out.println(b.getAcc().getAccno() );
			System.out.println(b.getAcc().getAcctype());
			
			System.out.println(b.getAcc().getP().getPname());
	        System.out.println(b.getAcc().getP().getPaddr());
	        System.out.println(b.getAcc().getP().getPmob());
			}
		
		}	

	public static void main(String [] args)
	{
		TestB t=new TestB();
		Set<Bank>x=t.SetDetails();
		t.getDetails(x);
	}
}
