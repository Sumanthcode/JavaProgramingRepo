class p11 
{
	int x =10;
	boolean y;
	// boolean x; // CTE // we cannot use same nome non-static variable inside class
	public static void main(String[] args) 
	{
		System.out.println("from main");
		p11 obj1=new p11();
		System.out.println("---------------");
		System.out.println("from obj1 refered by obj1");
		obj1.x=20;
		System.out.println(obj1); // address
		System.out.println(obj1.x);// 20
		System.out.println(obj1.y);//false
		System.out.println("-----------------");
		p11 obj2=new p11();
		System.out.println("------------------");
		System.out.println("from obj refered by obj2");
		System.out.println(obj2); // address
		System.out.println(obj2.x); // 10
		System.out.println(obj2.y); // false
		System.out.println("------------------");
		System.out.println(obj1==obj2);
	}
}
// *obj1 and obj2 are "OBJECT REFERENCE VRIABLE"
// *'new' is keyword used to create object, which returns the address of the object.
// *object reference variable holds the address of the object.