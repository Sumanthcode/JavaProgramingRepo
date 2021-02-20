class B2 extends B1 
{
	String str;
	boolean flag;
	B2()
	{
	}
	B2(int i,char ch,String str,boolean flag)
	{
		super(i,ch);
		this.str=str;
		this.flag=flag;
	}
	public boolean equals(Object obj)
	{
		B2 temp=(B2)obj;
		return super.equals(temp) &&
			this.str.equals(temp.str) &&
			this.flag==temp.flag;
	}
	/*public int hashCode()
	{
		int hc;
		if(flag==true)
		{
			hc=hc+1;
		}
		else
			hc=hc+1;
		hc=hc*/
}
