class p1 //lcm
{
	public static void main(String[] args) 
	{
		int a=5;
		int b=10;
		int lcm=0;
			int big=a>b?a:b;
			if(big%a==0 && big%b==0)
		{
		  lcm=big;
		}
		System.out.println(lcm);
	}
}
