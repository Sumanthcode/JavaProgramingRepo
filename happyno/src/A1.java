/*
a no. said to be a happy no. if the sum of square of individual digits is equal to one.
eg.19.
* between 1 and 9 we have two happy no. one and seven.
*to check whether               reduce it to single digit, if it is one or seven then,no. is happy no.
*/
class  A1
{
	public static void main(String[] args) 
	{
		int num=123;
		int res=0;
		while(num>9)
		{
			res=0;
			while(num>0)
			{
				int d=num%10;
				res=res+(d*d);
				num=num/10;
			}
			num=res;
		}
		if(num==1||num==7)
		{

		System.out.println("it is a happy no.");
		}
		else
			System.out.println("it is not happy no.");
	}
}
