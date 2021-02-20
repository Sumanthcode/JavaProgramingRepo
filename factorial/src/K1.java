import java.util.Scanner;
class K1
{
	public static int fact(int n)
	{
		int fact=1;
		for(int i=2;i<=n;i++)
		{
			fact=fact*i;
		}
		return fact;
	}


	
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value of x");
		int x=s.nextInt();
		System.out.println(fact(x));

		

	}

}
