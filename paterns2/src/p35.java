/*
g
g*o
g*o*o
g*o*o*g
g*o*o*g*l
g*o*o*g*l*e

*/
class p35
{
	public static void main(String[] args) 
	{
		int k=0;
		int n=6;
		char[] ch={'g','o','o','g','l','e'};
		for(int i=0;i<n;i++)
		{
			k=0;
			for(int j=0;j<i*2+1;j++)
			{
				
				if(j%2==0)
				{

				System.out.print(ch[k++]);
				}
				else
					System.out.print("*");
			}
		System.out.println();

		}
	}
}
