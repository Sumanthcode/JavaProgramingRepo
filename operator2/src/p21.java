class p21 
{
	public static void printeven(int n)

	{
		if (n==-1)
		{
			return;
		}

		if(n%2==0)
		{
			System.out.println(n);
			
			
		}
		n--;
		printeven(n--);
		
	}
		
	public static void main(String[] args) 
	{
		int n;
		printeven(12);
	}
}
