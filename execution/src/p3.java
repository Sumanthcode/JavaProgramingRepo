class p3 
{
	public static int test1()
	{
		return 10 + test2();
	}
	public static int test2();
	{
		return 20;
	}
	static int i = test2();
	static int j = test1() + test2();
	static
	{
		System.out.println("from sib");
		System.out.println(i);
		System.out.println(j);
	}
	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}
