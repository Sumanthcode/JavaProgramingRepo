class s6
{
	public static void main(String[] args) 
	{
		int n=5;
		char k='a';
		
		for (int i=0;i<n ;i++ )
		{
			k='a';
			for(int j=0;j<n;j++)
			{
				if (i==j)
				{
					System.out.print(1);
				}
				else if(i>j)
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
