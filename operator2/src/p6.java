class p6 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int a =10 ;
		int b =20;
		if (false && a <= b++) // false
		{
			System.out.println("if-block");
		}
		else
		{
			System.out.println("else-block"); // else block
		}
		System.out.println(b); // 20
	}
}
