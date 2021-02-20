class s5
{
	public static void main(String[] args) 
	{
		int n=4;
		int k=1;
		for (int i=0;i<n ;i++ )
		{
			for(int j=0;j<n;j++)
			{
				if (i==0||i==n-1||j==0||j==n-1)
				{
					System.out.print(0)
				}
				if(i==j)
				{
					System.out.print(k);  // or System.out.print(i+1);
				}

				else
					System.out.print("  ");
			}
			
			System.out.println();
		}
		
	}
}
