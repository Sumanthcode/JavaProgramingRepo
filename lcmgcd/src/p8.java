/*
write a prog to obtain every alternative term of the following series
2,5,11,....
*/
class p8
{
	public static boolean isPrime(int n)
		{
		boolean flag=true;
		for(int i=2;i<n;i++)
			{
			if(n%i==0)
				{
				flag=false;
				break;
				}
			}
			return flag;
		}

	public static void main(String[] args) 
	{
		int term=0;
		for(int i=2;term<20;i++)
		{
			if(isPrime(i))
			{
				term++;
				if(term%2==1)
				{
				System.out.print(i+",");
				}
			}
		}
	}
}
