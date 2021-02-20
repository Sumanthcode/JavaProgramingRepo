class D1 
{
	int i;
	int j;
	D1()
	{
	}
	D1(int i,int j)
	{
		this.i=i;
		this.j=j;
	}
		public boolean equals(Object obj)
	{
			D1 temp=(D1)obj;
			return this.i == temp.i&&
				this.j==temp.j;
	}
}
