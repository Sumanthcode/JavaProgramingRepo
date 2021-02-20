class cdetail 
{
	public static void main(String[] args) 
	{
		customer ob=new customer("smith",1000,30);
		System.out.println(ob.geteid());
		System.out.println(ob.ename);
		System.out.println(ob.sal);
		System.out.println(ob.deptno);
		ob.work();
		System.out.println("-------------------");
		customer ob1=new customer("jones",1500,10);
		System.out.println(ob1.geteid());
		System.out.println(ob1.ename);
		System.out.println(ob1.sal);
		System.out.println(ob1.deptno);
		ob1.work();
		System.out.println("-------------------");
		customer ob2=new customer("martin",2000,20);
		System.out.println(ob2.geteid());
		System.out.println(ob2.ename);
		System.out.println(ob2.sal);
		System.out.println(ob2.deptno);
		ob2.work();
		System.out.println("-------------------");
	}
}
