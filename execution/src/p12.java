class p12 
{
	void test() // non-static method
	{
		System.out.println("from test()");
	}
	public static void main(String[] args) 
	{
		System.out.println("from main");
		p12 obj=new p12();
		obj.test(); // non-static method calling statement
	}
}
