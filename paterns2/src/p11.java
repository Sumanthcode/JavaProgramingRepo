/*
        a
       ab
      abc
     abcd
*/
class p11
{
	public static void main(String[] args) 
	{
		int n=4;
		char ch='a';
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i+j>=n-1)
				{
				System.out.print(ch++);
				}
				else
					System.out.print(" ");
			}

		     System.out.println();
			 ch='a';
		}
	}
}
