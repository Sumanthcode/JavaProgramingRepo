/*
1079
15107
91510
*/
class p33
{
	public static void main(String[] args) 
	{
		int k=0;
		int n=3;
		int[] a={10,7,9,15};
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(k==a.length)
				{
					k =0;
				}
				System.out.print(a[k]);
				k++;
			}
		System.out.println();
		}
	}
}
