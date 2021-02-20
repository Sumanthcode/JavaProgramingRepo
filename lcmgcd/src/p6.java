/* write the prog to print the following series up to 10th term.
1,4,9,16,25,36....
*/
import java.util.Scanner;
class p6 
{
	public static int power(int x,int n)
	{
		int pow=1;
		for(int i=0;i<n;i++)
		{
			pow=pow*x;
		}
		return pow;
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no. of terms required");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i!=1)
			{
				System.out.print(",");
			}

	
		System.out.print(power(i,2));
		}
	}
	}


/*
class p6 
{
	public static void main(String[] args) 
	{
		int x;
		int n=10;
		int res;
		for(int x=1;x<=n;x++)
		{
			int res=x*x;
			x++;
		}
		System.out.println(res);
	}
}
*/