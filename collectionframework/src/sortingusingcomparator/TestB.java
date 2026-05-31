package sortingusingcomparator;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TestB {
	

	

	public static void main (String [] args)
	{
		Set<Bank >b=null;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("-----Select----");
		System.out.println("1 Bid\n"
				+"2 Bname\n"
				+"3 Addr\n"
				+"4 Accunt no\n"
				+"5 Account type"); 
		System.out.println("6 person name\n "
				+"7 person address\n"
				+"8 person mobno");
				
						
		int ba=sc.nextInt();
		if(ba==1)
		{
		  Comparator<Bank> id=(b1,b2)->b1.getBid()-b2.getBid();
		   b =new TreeSet<>(id);
		}else if (ba==2)
		{
			Comparator <Bank>name=(b1,b2)->b1.getBname().compareTo( b2.getBname());
			 b=new TreeSet<>(name);
			 
		}else if (ba==3)
		{
			Comparator <Bank>adress=(b1,b2)->b1.getAddr().compareTo(b2.getAddr());
			 b=new TreeSet<>(adress);
			 
		} else if( ba==4)
		{
			Comparator<Bank>acno=(b1,b2)->b1.getAcc().getAccno()-b2.getAcc().getAccno();
			b =new TreeSet<>(acno);
		}else if(ba==5)
		
		{
			Comparator<Bank>actype=(b1,b2)->b1.getAcc().getAcctype().compareTo(b2.getAcc().getAcctype());
			b=new TreeSet<>(actype);
		}else if(ba==6)
		{
			Comparator<Bank>pname=(b1,b2)->b1.getAcc().getP().getPname().compareTo(b2.getAcc().getP().getPname());
			b=new TreeSet<>(pname);
		}else if(ba==7)
		{
			Comparator<Bank>paddr=(b1,b2)->b1.getAcc().getP().getPaddr().compareTo(b2.getAcc().getP().getPaddr());		
		    b=new TreeSet<>(paddr);
		}
		else if(ba==8)	
		{
			Comparator<Bank> permob = (b1, b2) -> (int)(b1.getAcc().getP().getPmob() - b2.getAcc().getP().getPmob());
			b = new TreeSet<>(permob);

		}
				
		
		
		Person per1=new Person();
		per1.setPname("aaa");
		per1.setPaddr("amt");
		per1.setPmob(879685884l);
		
		
		Account acc=new Account();
		acc.setAccno(1000);
		acc.setAcctype("savings");
		acc.setP(per1);
		
	    Bank b1=new Bank();
	    b1.setBname("pqr");
	    b1.setBranch("sbi");
	    b1.setAddr("pune");
	    b1.setAcc(acc);
	
	   
	    
	    Person per2=new Person();
		per2.setPname("bbb");
		per2.setPaddr("amt");
		per2.setPmob(65443322l);
		
		
		Account acc1=new Account();
		acc1.setAccno(2000);
		acc1.setAcctype("savings");
		acc1.setP(per2);
		
	    Bank b2=new Bank();
	    b2.setBname("xyz");
	    b2.setBranch("icic");
	    b2.setAddr("pune");
	    b2.setAcc(acc1);
	    
	    
	    Person per3=new Person();
		per3.setPname("bbb");
		per3.setPaddr("amt");
		per3.setPmob(879685884l);
		
		
		Account acc2=new Account();
		acc2.setAccno(3000);
		acc2.setAcctype("savings");
		acc2.setP(per3);
		
	    Bank b3=new Bank();
	    b1.setBname("");
	    b1.setBranch("sbi");
	    b1.setAddr("pune");
	    b1.setAcc(acc2);
	
	
	b.add(b1);
	b.add(b2);
	b.add(b3);
	
	b.forEach(com->
	{
		System.out.println(com.getBname());
	    System.out.println(com.getBranch());
		System.out.println(com.getAddr());
		System.out.println(com.getAcc().getAccno());
	    System.out.println(com.getAcc().getAcctype());
		System.out.println(com.getAcc().getP().getPname());
		System.out.println(com.getAcc().getP().getPaddr());
		System.out.println(com.getAcc().getP().getPmob());
	}
			
			);
	
	
	
}
}
		
	
