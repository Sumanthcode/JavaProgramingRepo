/* *****
    ***
     * */

class p26 
{
	public static void main(String[] args) 
	{
		int n=3;
		int ch=5;
		int sp=0;
	
		for(int i=0;i<n;i++)
		{
			//space
			for(int j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			
			//character
			for(int j=0;j<(n-i)*2-1;j++)
			{
				System.out.print("*");
			}
		
		System.out.println();
		
		}
	}
}

		
