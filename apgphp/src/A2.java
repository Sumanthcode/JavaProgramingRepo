*

class A2
{
	static void t1(int n)
	{

	int a=1;
	int b=2;
	//int n=10;
	for(int i=0;i<n/2;i++)
		{
		System.out.print(a + ",");
		a+=3;
		System.out.print(b + ",");
		b+=2;
		}
	}
	public static void main(String[] args) 
	{
		t1(15);
		//System.out.println("Hello World!");
	}
}
