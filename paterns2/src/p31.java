
/*
      *468*
       246
        8

*/
class p31 
{
	public static void main(String[] args) 
	{
		int n=3;
		int k=2;
		int ch=5;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<ch;j++)
			{
				if(i==0&&(j==0||j==ch-1))
				{
					System.out.print("*");
				}
				else
				System.out.print(k);
				k+=2;
				if(k==12)
				{
					k=2;
				}
			}
			
			System.out.println();
			ch-=2;
		}

		
	}
}
