/*
Armstrong number:
*/
import java.util.Scanner;
class A3 
{
	public static int countDigit(int num)
	{
		int i=0;
		for( i=0;num>0;i++)
		{
			num /=10;
		}
			return i;
	}
	public static int power(int x,int n)
	{
		int power=1;
		for(int i=1;i<=n;i++)
		{
			power=power* x;
		}
			return power;
	}

	public static void main(String[] args) 
	{

		Scanner s=new Scanner(System.in);
		System.out.println("enter the no.");
		int num=s.nextInt();
		int temp=num;
		int sum=0,n=countDigit(num);
		while(temp>0)
		{
			int d=temp%10;
			sum=sum+power(d,n);
			temp=temp/10;
		}
		if(sum==num)
		{
			System.out.println("no.is armstrong");
		}
		else
            System.out.println("no.is not armstrong");
	}
}
/*
assignment
write prog to print armstrong no. between 1 and 1000
*/