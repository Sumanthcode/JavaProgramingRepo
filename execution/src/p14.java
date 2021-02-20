class p14 
{
	int a=100;
	void test()
	{
		int a=10;
		System.out.println(a);
		System.out.println(this); // 'this' is a keyword in java
		System.out.println(this.a);// this is use to access member of object from non-static context.
	}
	public static void main(String[] args) 
	{
		System.out.println("from main");
		p14 obj=new p14();
		System.out.println(obj);
		obj.test();
	}
}
// 'this' holds the address of the object. 'this' can be used only in non-static context.
// 'this' is local for non-static context