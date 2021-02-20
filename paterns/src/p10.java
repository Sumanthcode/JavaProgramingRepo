class p10

{
	public static void main(String[] args) 
	{
		int lines=4;
		int k=1;
		char ch='a';
		
			for(int i=0;i<lines;i++)
		{
			for(int j=0;j<lines;j++)
			{
				if(i%2==0)
				{
					System.out.print(k);
				}
				else
					System.out.print(ch);
			}
			if(i%2==0)
			{
				k++;
			}
			else 
				ch++;
	       System.out.println();
		}

	}
}
