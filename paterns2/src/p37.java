/*
1
32
456
10987
*/
class p37 
{
	public static void main(String[] args) 
	{
		int n=4;
		int k=1;
		for (int i=0;i<n ;i++ )
		{
			for(int j=0;j<=i;j++)
			{
				if(i%2==0)
				{
					System.out.print(k++);
				}
				else
					k++;
			}
			int l=k-1;
			for(int j=0;j<=i;j++)
			{
				if(i%2==1)
				{
					System.out.print(l--);
				}
				else
					l--;
			}
			System.out.println();
		}
	}
}
