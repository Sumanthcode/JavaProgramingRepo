/*
  1
 212
32123

*/
class p32 
{
	public static void main(String[] args) 
	{
		int n=3;
		int ch=5;;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-(i+1);j++)
			{
				System.out.print(" ");
			}
			int k=i+1;
			for(int j=0;j<=i;j++)
			{
				System.out.print(k);
				k--;

			}
			k=2;
			for(int j=1;j<=i;j++)
			{
				System.out.print(k);
				k++;
			}

		System.out.println();
		ch=ch-1;
		
		}
	}
}
