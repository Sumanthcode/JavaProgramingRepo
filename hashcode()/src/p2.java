class p2 
{
	public static void main(String[] args) 
	{
		A obj1=new A(10);
		A obj2;
		obj2=obj1;

		System.out.println(obj1.hashCode());
		System.out.println(obj1);
		System.out.println(obj2.hashCode());
		System.out.println(obj2);
		System.out.println(obj1.equals(obj2));
	}
}
