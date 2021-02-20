// lagest of 3 n0
import java.utill.Scanner ;
class p11 
{
	public static void main(String[] args) 
	{
		Scanner S ;
		S = new Scanner(System.in); // constructor
		int a, b, c;
		System.out.println("enter vlaue for a");
		a = S.nextInt();
		System.out.println("enter vlaue for b");
		b = S.nextInt() ;
		System.out.println("enter vlaue for c");
		c = S.nextInt() ;
		if (a > b && a > c)
		{
			System.out.println("the largest number is:"+a);
		}
		else if( b > c && b>a)
		{
			System.out.println("the largest number is:"+b);
		}
		else
		{
		System.out.println("the largest number is:"+c);
	}
}
}
