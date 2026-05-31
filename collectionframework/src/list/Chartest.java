package list;
import java.util.*;
public class Chartest {
public static void main(String []args)
{
	List<Character>al=new ArrayList<>();
			al.add('a');
			al.add('b');
			al.add('c');
			
			al.add('d');
			
			al.add('e');
	for(char c:al) {
		System.out.println(c);
	}
		
}
}