import java.util.*;
import java.io.*;
class test
{
	public static void main(String argd[])
	{
		Properties prop=new Properties();
		FileOutputStream fs=null;
		
		try
		{
			fs=new FileOutputStream("myprop.properties");
			prop.setProperty("name","fthy");
			prop.setProperty("id","678");
			prop.store(fs,null);
			
			fs.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}