package Readfile;

import java.io.File;
import java.util.Scanner;

public class Test {
	
	public  void readfile() 
	{
		File fh=new File("C:\\Users\\ASUS\\OneDrive\\Desktop");
		
		boolean canread=fh.canRead();
		
		if(canread)
		{
			Scanner sc=new Scanner(fh);
			
			while (sc.hasNextLine());
			{
				String line=sc.nextLine();
				System.out.println(line);
			}
		}
	}
}
