class road1
{
	static void display(vehicle b)
	{
		System.out.println("-----------------------");
		System.out.println("vehicle count:"+b.vc);
		System.out.println("vehicle name:"+b.name);
		if(b instanceof TwoW)
			
		System.out.println("vehicle color:"+((TwoW)b).color);
		if(b instanceof bike)
		System.out.println("vehicle color:"+((bike)b).mileage);
		System.out.println("--------------------------");
	}
	public static void main(String[] args) 
	{
		bike b1=new bike("pulsar","black",40);
		
		//bike b2=new bike("pulsar","blue",45);
		TwoW b3=new TwoW("pulsar","red");
		vehicle b4=new vehicle("pulsar");
		display(b1);
		//display(b2);
		display(b3);
		display(b4);
	
	}
}
