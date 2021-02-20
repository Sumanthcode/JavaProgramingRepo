
//DIFFERENT WAYS OF USING NON-STATIC MEMBER FROM STATIC CONTEXT?


class p11 
{
	int a=10;
	static void test()
	{
		p11 obj=new p11();
		System.out.println(obj.a);
	}
	public static void main(String[] args) 
	{
		System.out.println("from main");
		
		test();
		p11 obj=new p11();
		System.out.println(obj.a);
		
	}
}
