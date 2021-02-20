class bike1 
{
	String color;
	double mileage;
	static bike1 createbike(String color,double mileage)
	{
		bike1 ob=new bike1(color,mileage);
		return ob;
	}
	bike1(String color,double mileage)
	{
		this.color=color;
		this.mileage=mileage;
	}
	void display()
	{
		System.out.println(color);
		System.out.println(mileage);
	}
	bike1 move()
	{
		System.out.println("the bike is moving");
		return this;
	}

	
}