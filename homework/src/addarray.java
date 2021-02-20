class addarray 
{
	public static void main(String[] args) 
	{
		int []a=new int[3];
		a[0]=30;
		a[1]=40;
		a[2]=50;
		System.out.println(add(a));
	}
		public static int add(int []a)
	{
			int res=0;
			for(int i=0;i<a.length;i++)
		{
				res=res+a[i];
		}
		return res;

	
	}
}
