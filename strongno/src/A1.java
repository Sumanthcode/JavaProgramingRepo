/* 
strong no.:
if the sum of factorials of digits of a no. is equal to the given no. then, it is known as a strong no.
eg. 145:1!+4!+5! = 145
eg.121:1!+2!+1! !=121 therefore it is not  astrong no.
write a program to check whether the entered no. is strong no.or not
*/

import java.util.Scanner;

class A1 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
			System.out.println("enter the number");

		int num=s.nextInt();
		int temp=num;
		int sum=0;
		while(temp>0)
		{
			int d =temp%10;
			sum=sum+fact(d);
			temp=temp/10;
		}
		if(num==sum)
		{
			System.out.println("no. is strong ");
		}
		else
			System.out.println("no.is not a strong ");
	}
	public static int fact(int n)
	{
		int fact=1;
		for(int i=2;i<=n;i++)
		{
			fact=fact*i;
		}
		return fact;
	}


		
	}

