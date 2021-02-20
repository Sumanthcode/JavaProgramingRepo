class p38 
{
	public static void main(String[] args) 
	{
		int ch=5;
		int sp=0;
		int n=3;
		int k=1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<sp;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<ch;j++)
			{
				if(i%2==1)
				{
				
				System.out.print(k+2);
				k--;
				}
				else
					System.out.print(k++);
			
			}
			System.out.println();
			
			k=;
			ch=ch-2;
			sp++;
			
			
		}
	}
}
