/*
1
35
713
5713
*/

class p15
{
	public static void main(String[] args) 
	{
		int n=4;
		int k=1;
		for(int i=0;i<n;i++)
		{
			
			for(int j=0;j<n;j++)
			{
				if(k==9)
			{
				k=1;
			}
				if(i>=j)
				{
					System.out.print(k);
					k=k+2;
				}
				else
					System.out.print(" ");
			}
		System.out.println();
		
		}
	}
}
