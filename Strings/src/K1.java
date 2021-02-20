class 
import java.util.ArrayList;
import java.util.TreeSet;
class K1
{	
	
	public static void main(String[] args) 
	{
		String s="hello good morning";
		count(s);

	}
	public static void count(String str)
	{
		char c[]=str.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			String n="";
			while(i<c.length && c[i]!=' ')
			{
				n=n+c[i];
				i++;
			}
			if(n.length()>0)
			System.out.println(n+ "-->"+ n.length());
		}
	}
		


}

