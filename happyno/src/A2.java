
/*write a prog to find all happy no. between 1000 and 2000;
*/

class  A2
{
	public static boolean ishappy(int num)
	{
		
		while(num>9)
		{
			int res=0;
			while(num>0)
			{
				int d=num%10;
				res=res+(d*d);
				num=num/10;
			}
			num=res;
		}
		boolean flag=true;
		if(num==1||num==7)
		{
			return true;

	 
		}
		
		return false;
	}

	
	public static void main(String[] args) 
	{
		for(int i=1000;i<=2000;i++)
		{
			if(ishappy(i))
			{
				System.out.println(i);
			}
		}
	}
}


/*
assignment:
3. find the sum of multiples of a no. if it is less than n
1.check whether the entered no.is prime , strong, armstrong, and happy,  display suitable message
2.check whether the entered no. is perfect square or not.

