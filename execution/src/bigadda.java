class bigadda 
{
	static user signup(String name,String pwd)
	{
		return user.createuser(name,pwd);
	}
		

	public static void main(String[] args) 
	{
		//user.signup("shama",1,"5432a").login();
		bigadda.signup("dinga","dinga13").login().userdetails();
	}
}
