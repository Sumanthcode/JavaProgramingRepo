class  A
{
	int i;
	A()
	{
	}
	A(int i)
	{
		this.i=i;
	}
	public boolean equals(Object obj)
	{
		return this.i=((A)obj).i;
	}
}
