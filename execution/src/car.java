class car
{
	static int  count;
	 

	private int u_no;
    private String name;
	private String color;
	private double mile;
	int getu_no()
	{
		return u_no;
	}
	String  getcolor()
	{
		return color;
	}
	String setcolor()
	{
		return color;
	}
	double getmile()
	{
		return mile;
	}
	String getname()
	{
		return name;
	}
	void move()
	{
		System.out.println( name+" moves faster");

	}
	void move1()
	{
		System.out.println(name+" moves more faster");
	}
	void move2()
	{
		System.out.println(name+" moves slower");
	}
	
	{
		count++;
	}
	car(int u_no, String name, String color, double mile)
	{
		this.u_no=u_no;
		this.name=name;
		this.color=color;
		this.mile=mile;
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
