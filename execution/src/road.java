class road 
{

	public static void main(String[] args) 
	{
		car ob=new car(111,"volkswagen","red",50);
		System.out.println("u_no:" +ob.getu_no());
		System.out.println("name:" +ob.getname());
		System.out.println("color:" +ob.getcolor());
		System.out.println("milage:" +ob.getmile());
		ob.move();
		System.out.println("-------------------");
		car ob1 =new car(222,"jaguar","white",60);
		System.out.println("u_no:" +ob1.getu_no());
		System.out.println("name:" +ob1.getname());
		System.out.println("color:" +ob1.getcolor());
		System.out.println("milage:" +ob1.getmile());
		ob1.move1();
		System.out.println("-------------------");
		car ob2 =new car(333,"aulto","grey",40);
		System.out.println("u_no:" +ob2.getu_no());
		System.out.println("name:" +ob2.getname());
		System.out.println("color:" +ob2.getcolor());
		System.out.println("milage:" +ob2.getmile());
		ob2.move2();
		System.out.println("-------------------");

		System.out.println("no.of cars:"+car.count);

	}
}
