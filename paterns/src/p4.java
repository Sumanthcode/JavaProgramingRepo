class p4
{
	public static void main(String[] args) 
	{
		int lines=4;
		int k=1;// or k=0 
			for(int i=0;i<lines;i++)
		{
			for(int j=0;j<lines;j++)
			{
				if(k==10)
				{
					k=1;
				}

		    System.out.print(k); // System.out.print(k++);or  System.out.print(k++%9+1)
		     k++;
			}
			System.out.println();
		}

	}
}
