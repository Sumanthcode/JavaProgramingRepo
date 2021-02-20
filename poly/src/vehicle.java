class vehicle 
{
	String color;
	double mileage;
	void move()
	{
		System.out.println("vehicle moves");
	}
	void move(String loc)
	{
		System.out.println("vehicle going to "+ loc);
	}
	vehicle(String color,double mileage)
	{
		this.color=color;
		this.mileage=mileage;
	}
	vehicle()
	{
	}
}
	
