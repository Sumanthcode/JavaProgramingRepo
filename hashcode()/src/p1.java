class p1 
{
	public static void main(String[] args) 
	{
		A obj1=new A(10);
		System.out.println(obj1.hashCode());
		A obj2=new A(10);
		System.out.println(obj2.hashCode());
	}
}
