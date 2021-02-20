class drive 
{
	public static void main(String[] args) 
	{
		int size=5;
		vehicle[] v=new vehicle[size];
		v[0]=new vehicle("red",20);
		v[1]=new car("sedan","grey",22);// upcasting car to vehicle
		v[2]=new vehicle("white",25);
		v[3]=new city("sedan","white",25);
		v[4]=new city("sedan","maroon",32);
		for(int i=0;i<v.length;i++)
		{
			System.out.println("color:"+v[i].color);
			System.out.println("mileage:"+v[i].mileage);
			if(v[i] instanceof car)
				System.out.println("type:"+((car)v[i]).type);
			v[i].move();
			v[i].move("paris");
		}
	}
}
