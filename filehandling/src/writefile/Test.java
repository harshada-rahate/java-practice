package writefile;

import java.io.FileWriter;

public class Test 
{
	
public void writefile() throws  Exception
{
	FileWriter fw= new FileWriter("C:\\Users\\ASUS\\OneDrive\\Desktop\\java.txt");
	
	fw.write("this is first line\n this is second line\n");
	fw.write("this is new line");
	
	System.out.println("Data added Sucessfully");
	fw.close();
}

public static void main( String [] args) throws Exception
{
	Test test=new  Test();
	test.writefile();
}

}
