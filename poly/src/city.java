class city extends car 
{
	void move(String loc)
	{
		System.out.println("going to"+loc+"in city which is a"+type);
	}
	city()
	{
	}
	city(String type,String color,double mileage)
	{
		super(type,color,mileage);
	}
}

	