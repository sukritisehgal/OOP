import java.util.*;
class stud
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
}
class idcom implements Comparator
{
	public int compare(Object ob1, Object ob2)
	{
		stud s1=(stud)ob1;
		stud s2=(stud)ob2;
		
		if(s1.id==s2.id)
		{
			return 0;
		}
		else if(s1.id>s2.id)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}
class namecom implements Comparator
{
	public int compare(Object ob1, Object ob2)
	{
		stud s1=(stud)ob1;
		stud s2=(stud)ob2;
		
		if(s1.marks==s2.marks)
		{
			return 0;
		}
		else if(s1.marks>s2.marks)
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
	public static void main(String ghu[])
	{
		stud s1=new stud("sukriti",78,89);
		stud s2=new stud("ghty",45,100);
		stud s3=new stud("ftrew",90,43);
		
		ArrayList al=new ArrayList();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		Collections.sort(al,new idcom());
		
		Iterator i=al.iterator();
		while(i.hasNext())
		{
			stud s=(stud)i.next();
			System.out.println(s.name + "\t" + s.id +"\t" + s.marks);
		}
		Collections.sort(al,new namecom());
		
		Iterator ii=al.iterator();
		while(ii.hasNext())
		{
			stud s=(stud)ii.next();
			System.out.println(s.name + "\t" + s.id +"\t" + s.marks);
		}
	}
}
		
		




	
