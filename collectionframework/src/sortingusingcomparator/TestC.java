package sortingusingcomparator;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TestC {
	public static void main(String [] args)
	{
		Set<Company> c =null;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("----Select---\n"
				            +"1 Cid sort\n"    
				             +"2 Cname sort \n"          
				             +"3 Mobno  sort\n");
		
		int co=sc.nextInt();
		if(co==1) {
			Comparator<Company>cidsort=(o1,o2)->o1.getCid()-o2.getCid();
			c=new TreeSet<>(cidsort);
		}else if(co==2)
		{
		Comparator<Company>cnamesort=(o1,o2)->o1.getCname().compareTo(o2.getCname());
		c=new TreeSet<>(cnamesort);
		}else if(co==3)
		{
			Comparator<Company>cmobnosort=(o1,o2)->(int)(o1.getCmobno()-o2.getCmobno());
			
			c=new TreeSet<>(cmobnosort);
	}

		Company c1=new Company();
		c1.setCid(1);
		c1.setCname("Infosys");
		c1.setCmobno(6959493032l);
		
		Company c2=new Company();
		c2.setCid(2);
		c2.setCname("wIPRO");
		c2.setCmobno(9995748383l);
		
		Company c3=new Company();
		c3.setCid(3);
		c3.setCname("Tcs");
		c3.setCmobno(6959493032l);
		
		c.add(c1);
		c.add(c2);
		c.add(c3);
		
		c.forEach((com)->System.out.println(com.getCid()+"  "+com.getCname() +"  "+com.getCmobno()   ));
}
}