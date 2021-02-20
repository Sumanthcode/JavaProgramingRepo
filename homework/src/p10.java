
//HOW CAN YOU USE STATIC MEMBER FROM STATIC CONTEXT?




class p10
{
	static int a;
	static void test()
	{
		System.out.println(p10.a);
		p10.a=10;
		System.out.println(a);
	}
	public static void main(String[] args) 
	{
		System.out.println("from main");
		test();
	}
}
