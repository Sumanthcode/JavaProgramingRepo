class p5 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int a =10 ;
		int b =20;
		if (true && a <= b++) // true
		{
			System.out.println("if-block"); // if block
		}
		else
		{
			System.out.println("else-block");
		}
		System.out.println(b); // 21
	}
}
