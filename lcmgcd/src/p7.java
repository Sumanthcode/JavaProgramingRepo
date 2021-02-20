/*
write a prog to obtain every alternative term of the following series
2,3,5,7,11,....
*/
class p7
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
		for(int i=2;term<10;i++)
		{
			if(isPrime(i))
			{
				term++;
				System.out.print(i+",");
			}
		}
	}
}
