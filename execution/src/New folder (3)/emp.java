class emp 
{
	static int count;
	private int eid;
	int geteid()
	{
		return eid;
	}
	String name;
	double salary;
	emp()
	{
		eid=count;
	}
	emp(String name, double salary)
	{
		this();
		this.name=name;
		this.salary=salary;
	}
	emp(String name)
	{
		this();
		this.name=name;
	}
	{
		count++;
	}
		void work()
	{
			System.out.println(name+" is working...");
	}
}
	