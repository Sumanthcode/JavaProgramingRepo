class p13 
{
	int a;
	void test()
	{
		System.out.println("from test()");
		System.out.println(a); // we can use non-static member directly without object reference inside non-static block.
	}
	public static void main(String[] args) 
	{
		System.out.println("from main");
		p13 obj=new p13();
		obj.test();
	}
}
