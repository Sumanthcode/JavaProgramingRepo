class customer 
{
	static int count;
	private int eid;
	String ename;
	double sal;
	int deptno;
	int geteid()
	{
		return eid;
	}
	void work()
	{
		System.out.println(ename+" is working");
	}
	customer()
	{
		eid=count;
	}
	{

		count++;
	}
		customer(String ename,double sal,int deptno)
	{
			this();
			this.ename=ename;
			this.sal=sal;
			this.deptno=deptno;
	}
}
	
