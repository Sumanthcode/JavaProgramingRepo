class B 
{
	int i;
	B()
	{
	}
	B(int i)
	{
		this.i=i;
	}
	public boolean equals(Object ob)
	{
		return this.i == ((B)ob).i;
	}
}
