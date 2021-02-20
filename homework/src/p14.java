class p15
{
	static int i=10;
	int j;
	p15()
	{
		System.out.println("----------------");
		System.out.println("from p14()");
		System.out.println(this);
		System.out.println(i);
		System.out.println(j);
	}
	public static void main(String[] args) 
	{
		p15 obj=new p15();
	}
}
