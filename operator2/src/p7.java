class p7
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int a =10 ;
		int b =20;
		int c= 30;
		if (true && a <= b++ && b <= c++)
		{
			System.out.println("if-block");
		}
		else
		{
			System.out.println("else-block");
		}
		System.out.println("b:" + b);
		System.out.println("c:" + c);
	}
}
