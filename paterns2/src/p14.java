/*
2468
246
24
2
*/

class p14 
{
	public static void main(String[] args) 
	{
		int n=4;
		int k=2;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i+j<=n-1)
				{
					System.out.print(k);
					k=k+2;
				}
				else
					System.out.print(" ");
			}
		System.out.println();
		k=2;
		}
	}
}
