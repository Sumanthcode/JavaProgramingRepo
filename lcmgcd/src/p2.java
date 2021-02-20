class p2 //lcm
{
	public static void main(String[] args) 
	{
		int a=30;
		int b=125;
		int big=0;
		int inc=0;
		int lcm=0;
			
			
		inc= big=a>b?a:b;
		while(true)
		{
		if(big%a==0 && big%b==0)
		{
		  lcm=big;
		  break;
		}
		else
			{
			big += inc;
			}
		}
		System.out.println(lcm);
	}
}
/*lcm= a*b/gcd(a,b)
 write a prog to find combination of two prime num such that if we add two prime num we should get back original num
 eg. 15--->13+2
 if(isprime(i))
 {
	 if(isprime(num-i)
 */