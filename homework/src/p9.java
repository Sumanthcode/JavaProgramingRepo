class p9 
{
	public static void even(n) 
	{
		if (n<=50)
		{
			if(n%2==0)
			{
				System.out.println(n);
			}
			n++;
			even(n);
		}
	}
	public static void main(String[] args)
	{
		even(2);
	}
}
	