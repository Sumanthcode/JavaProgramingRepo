class emp1 
{
	static int c=0;
	private int eid;
	String name;
	private double sal;
	{
		c++; 
		
	}
	int geteid()
	{
		return eid;
	}
	void seteid(int a)
	{
		this.eid=a;
	}
	emp1(String name,double sal )
	{
		this();
		this.name=name;
		this.sal=sal;
	}
	emp1()
	{
		eid=c;
	}
}


	

