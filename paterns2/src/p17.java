/*

1
2*3
4*5*6
7*8*9*1
2*3*4*5*6
*/

class p17
{
	public static void main(String[] args) 
	{
		int n=5;
		int k=1;
		for(int i=0;i<n;i++)
		{
			
			for(int j=0;j<i*2+1;j++)
			{
				if(k==10)
				{
					k=1;
				}
				if(j%2==1)
				{
				System.out.print("*");
				}
				else
					System.out.print(k++);
			}
			System.out.println();
		
		}
	}
}
/*
class p17
{
	public static void main(String[] args) 
	{
		int n=5;
		int k=0;
		for(int i=0;i<n;i++)
		{
			
			for(int j=0;j<i*2+1;j++)
			{
				
				if(j%2==0)
				{
				System.out.print(k++%9+1);
				}
				else
					System.out.print("*");
			}
			System.out.println();
		
		}
	}
}
*/
