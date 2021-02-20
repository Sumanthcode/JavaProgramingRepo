class p4 
{
	static
	{
		System.out.println(i); // using variable before initialization leads to illigal forward variable
	}
	static int i;

	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}
// it throws illigal forward reference error
 // 

 // illigal forward reference error: when a static variable is used in the static initializer, before the declaration statement we get IFR ERROR
                                      