class empdriver
{

	public static void main(String[] args) 
	{
		emp ob =new emp("rama",1000);
		System.out.println("eid:"+ob.geteid());
		System.out.println("name:"+ob.name);
		System.out.println("sal:"+ob.salary);
		ob.work();
		System.out.println("-----------------");
		emp ob1=new emp("shama");
		System.out.println(ob1.geteid());
		System.out.println(ob1.name);
		System.out.println(ob1.salary);
		ob1.work();
		System.out.println("-------------------");
		emp ob2=new emp();
		System.out.println(ob2.geteid());
		System.out.println(ob2.name);
		System.out.println(ob2.salary);
		ob2.work();
		System.out.println("no. of emp:"+emp.count);
	}
}
