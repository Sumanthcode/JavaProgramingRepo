/*

A
B*A
C*B*A
D*C*B*A
E*D*C*B*A//not solved
*/

class p18
{
	public static void main(String[] args) 
	{
		int n=5;
		char ch='A';
		for(int i=0;i<n;i++)
		{
			ch=(char)('A'+i);

			
			for(int j=0;j<i*2+1;j++)
			{
				
				if(j%2==0)
				{
				System.out.print(ch--);
				}
				else
					System.out.print("*");
			}
			System.out.println();
			
		
		}
	}
}