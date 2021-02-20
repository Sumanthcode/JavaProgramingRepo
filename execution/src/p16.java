class animal 
{
	static int count;
	double weight;
	double hight;
	void eat()
	{
		System.out.println("animal eat food..");
	}
	{
		count++;
	}

}
class dog extends animal
{
	void sniff()
	{
		System.out.println("dog are expert in sniffing");
	}

}
class world
{
	public static void main(String[] args)
	{
		dog d1;
		d1=new dog();
		d1.hight=2.3;
		d1.weight=30;
		System.out.println(d1.count);
		d1.eat();
		d1.sniff();
		System.out.println("weight:"+d1.weight);
		System.out.println("hight:"+d1.hight);
	}
}
