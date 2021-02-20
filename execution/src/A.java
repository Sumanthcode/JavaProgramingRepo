class A 
{
	int i=10;
	static int j=20;
	static void test(A x)
	{
		System.out.println(x.i);
		//System.out.println(ob.i); //CTE  because, in this method you are not created an object.
		//you are created an object inside main method.
		System.out.println(x.j);
	}
	public static void main(String[] args) 
	{
		A ob=new A();
			test(ob);
	}
}
