
// DIFFERENT WAYS OF USING NON-STATIC MEMBER FROM A NON-STATIC CONTEXT?


class p13 
{
	int a=1;
	void test()
	{
		System.out.println(a);
		System.out.println(this.a);
	}
	public static void main(String[] args) 
	{
		System.out.println("from main");
		p13 obj=new p13();
		obj.test();
	}
}
