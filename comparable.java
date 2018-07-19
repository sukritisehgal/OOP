//import java.util.collections.*;
import java.util.*;
class stud implements Comparable
{
	String name;
	int id;
	int marks;
	
	stud(String name, int id, int marks)
	{
		this.name=name;
		this.id=id;
		this.marks=marks;
	}
	public int compareTo(Object on)
	{
		stud s=(stud)on;
		if(id==s.id)
		{
			return 0;
		}
		if(id>s.id)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}
class test
{
	public static void main(String ghk[])
	{
		//@SuppressWarnings("unchecked");
		
		stud s1=new stud("Sukriti",65,23);
		stud s2=new stud("hjkn",56,98);
		stud s3=new stud("ghty",78,78);
		
		ArrayList al=new ArrayList();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		Collections.sort(al);
		
		Iterator i=al.iterator();
		while(i.hasNext())
		{
			stud s=(stud)i.next();
			System.out.println(s.name + s.id + s.marks);
		}
	}
}
	
