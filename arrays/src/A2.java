// linear search
import java.util.Scanner;
class A2 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int []a={10,20,30,40};
		boolean flag=true;


		System.out.println("enter the value");
		int n=s.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==n)
			{
				System.out.println("no. is found");
				flag=false;
				break;
			}
			
		}
		if(flag)
		{
			System.out.println("no.not found");
		}

	}
}
