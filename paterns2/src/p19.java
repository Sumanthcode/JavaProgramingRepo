/*
A
B*C
D*E*F
G*H*I*J
K*L*M*N*O
*/

class p19
{
	public static void main(String[] args) 
	{
		int n=5;
		char ch='A';
		for(int i=0;i<n;i++)
		{
			
			for(int j=0;j<i*2+1;j++)
			{
				
				if(j%2==1)
				{
				System.out.print("*");
				}
				else
					System.out.print(ch++);
			}
			System.out.println();
		
		}
	}
}