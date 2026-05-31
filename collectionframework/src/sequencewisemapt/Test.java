package sequencewisemapt;
import java.util.HashMap;
import java.util.Map;

public class Test {
	
	
public static  void main(String [] args)
		{
			Map<Integer,String>m=new HashMap<>();
			m.put(5,"java");
			m.put(10, "python");
			m.put(15,"c++");
			System.out.println(m);
			
			m.forEach( (a,b) -> {
				System.out.println(a);   
				System.out.println(b);
				}       
			);
			
}
}