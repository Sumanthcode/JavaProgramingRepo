class p10
{
	public static void main(String[] args) 
	{
		System.out.println("main begin"); // mb
		int a =10 ;
		int b =20;
		int c= 30;
		if (false || a >= b++ || b <= c++) // false
		{
			System.out.println("if-block"); 
		}
		else
		{
			System.out.println("else-block"); // else block
		}
		System.out.println("b:" + b); //20 
		System.out.println("c:" + c); // 30
	}
}
