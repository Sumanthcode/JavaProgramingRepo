class user 
{
	static int count=0;
	String name;
	private int uid;
	private String pwd;
	{
		uid=++count;
	}
	static user signup(String name,int uid,String pwd)
	{
		user ob=new user(name,pwd);
		return ob;
	}
	user()
	{
	}
	user(String name,String pwd)//2
	{
		this.name=name;
		//this.uid=uid;
		this.pwd=pwd;
	}
	static user createuser(String name,String pwd)
	{
		return new user(name,pwd);
	}

	user login()
	{
		System.out.println(name+"loged in successfully");
		
		return this;
	}
	user userdetails()
	{
		System.out.println("uid:"+uid);
		System.out.println("username:"+name);
		return this;
	}

	
}
