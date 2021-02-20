class B1
{
	int i;
	char ch;
	B1()
	{
	}
	B1(int i,char ch)
	{
		this.i=i;
		this.ch=ch;
	}
	public boolean equals(Object obj)
	{
		B1 temp=(B1)obj;
		return this.i==temp.i &&
			this.ch==temp.ch;
	}
	public int hashCode()
	{
		int hc;
		hc=i;
		hc=hc+ch;
		return hc;
	}

}
