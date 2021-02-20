/*
       *
      ***
     *****
*/
class p20
{
	public static void main(String[] args) 
	{
		int n=3;
		int ch=1;
		int sp=2;
	
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<sp;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<ch;j++)
			{
				System.out.print("*");
			}
		
		System.out.println();
		ch=ch+2;
		sp--;
		}
	}
}
