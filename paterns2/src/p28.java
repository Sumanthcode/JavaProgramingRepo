/*  
  *
 ***
*****
*****
 ***
  *
*/
class p28
{
	public static void main(String[] args) 
	{
		int n=6;
		//int n=3;
		int ch=1;
		int sp=2;
		//int ch=5;
		//int sp=0;
	
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<(n-i)*2-1;j++)
			{
				System.out.print("*");
			}
			if(i>=n/2)
		
			//space
			for(int j=0;j<n-(i+1);j++)
			{
				System.out.print(" ");
			}
			//character
			for(int j=0;j<(i*2)+1;j++)
			{
				System.out.print("*");
			}
		
		System.out.println();
		
		}
	}
}

		
