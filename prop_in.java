import java.util.*;
import java.io.*;
class test
{
	public static void main(String ght[])
	{
		Properties prop=new Properties();
		FileInputStream fs;
		
		try
		{
			fs=new FileInputStream("/Users/sukritisehgal/Documents/myprop.properties");
			prop.load(fs);
			
			System.out.println(prop.getProperty("name"));
			System.out.println(prop.getProperty("id"));
			
			fs.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}