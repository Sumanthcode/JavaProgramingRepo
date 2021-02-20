//sorting string
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.Set;
import java.util.Collections;
import java.util.Scanner;
class K4
{	
	
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter string");

		char temp;

		String str=s.next();;
		String ss="";
		char []c=str.toCharArray();

		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c.length;j++)
			{
				if(c[i]<c[j])
				{
					temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
		}
		for(int k=0;k<c.length;k++)
		{
			ss=ss+c[k];
		}
		System.out.println(ss);
	}

}
