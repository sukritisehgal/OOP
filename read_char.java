import java.io.*;
import java.util.*;
class test
{
	public static void main(String gh[])
	{
		try
		{
			BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
			Scanner s=new Scanner(System.in);
			int size=s.nextInt();
			for(int i=0;i<size;i++)
			{
				System.out.println(i);
				char ch=(char)bf.read();
				
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
		