class car extends vehicle 
{
	String type;
	void move() // overriding method
	{
		System.out.println(type+"car moves smoothly");
	}
	car()
	{
	}
	car(String type,String color,double mileage)
	{
		super(color,mileage);
		this.type=type;
	}
}
	