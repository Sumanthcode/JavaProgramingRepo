class p2  
{
	static int i;
	static
	{
		System.out.println(i);
		int i=10;
		this.i=20;
		System.out.println(i);
		System.out.println(p2.i);
	}
	public static void main(String[] args)
	{
		System.out.println("done..!!");
	}
}