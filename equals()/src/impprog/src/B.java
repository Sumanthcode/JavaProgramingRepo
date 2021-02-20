class B 
{
	public static void main(String[] args) 
	{
		B2 obj1=new B2(10,20,"hello",true);
		B2 obj2=new B2(10,20,"helloo",true);
		System.out.println(obj1.equals(obj2));
		//System.out.println(obj1.hashCode());
		//System.out.println(obj2.hashCode());
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println("------------------------------");
		B2 obj3=new B2(10,20,"bye",true);
		B2 obj4=new B2(10,20,"hello",true);
		System.out.println(obj3.equals(obj4));
		//System.out.println(obj3.hashCode());
		//System.out.println(obj4.hashCode());
		System.out.println(obj3);
		System.out.println(obj4);

	}
}
