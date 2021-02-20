class r1 
{
	public static void main(String[] args) 
	{
		bike1 ob1=new bike1("red",30);
		ob1.move();
		ob1.display();
		System.out.println("---------------------------------");
		bike1.createbike("red",30).move().display();
		
		
	}
}
