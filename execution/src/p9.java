class p9 
{
	static void test()
	{
		System.out.println("from test");
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		test();
		p9.test();
	}
}
// static mathod:  a method prifixed with static keyword is known as static method.
// * static method will be present in the clss block(memory allocation)
// note: a static method can be use-
                                // 1. directly with method name
								// 2. it can also be used with the help of clss name as follows: class name.method name(actual arguments)