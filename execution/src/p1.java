class p1 
{
	static int i; // all static variables are global variable.
	static int j=10;
	static
	{
		i =test();
	}
	static
	{
		System.out.println("from SIB-2");
		System.out.println(j);
		j=100;                                                                                                                           
		System.out.println(j);
	}
	public static int test()
	{
		System.out.println("from test()");
		System.out.println(i);
		System.out.println(j);
		return 100;
	}
	public static void main(String[] args)
	{
		System.out.println("from main");
		i=10;
		p1.i=20;
		j=30;
		p1.j=40;
		System.out.println(i);
		System.out.println(p1.j);
	}
	static
	{
		System.out.println("from sib-3");
		System.out.println(i);
	}

}