
// power
import java.util.Scanner;


class p5 
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

		System.out.println("enter the value of x");
		int x=s.nextInt();
		System.out.println("enter the value of y");
		int n=s.nextInt();
		System.out.println(x+"power"+n+"is:" + power(x,n));
	}
}
