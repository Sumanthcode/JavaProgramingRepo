class isprime
{
	public static void printprime(int n) 
	{
		for(int i=2;i<=n;i++)
		{
			if(isprime(i))
			{
				System.out.println(i);
			}
		}
	}
	public static boolean isprime(int n)
	{
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
	return true;
	}
	public static void main(String[] args)
	{
		printprime(10);
	}
	
}
