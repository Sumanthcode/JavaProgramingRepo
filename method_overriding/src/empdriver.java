class empdriver 
{
	public static void main(String[] args) 
	{
		emp ob1=new emp();
		ob1.work();
		developer ob2=new developer();
		ob2.work();
		tester ob3=new tester();
		ob3.work();
		System.out.println("-------------------");// or
		emp[] e={ob1,ob2,ob3,new tester()};
		for(int i=0;i<e.length;i++)
		{
			e[i].work();
		}

	}
}
