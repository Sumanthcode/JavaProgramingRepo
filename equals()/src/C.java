class C

{
	int i;
	int j;
	double k;
	C()
	{
	}
	C(int i,int j,double k)
	{
		this.i=i;
		this.j=j;
		this.k=k;
	}
	public boolean equals(Object obj)
	{
		C temp=(C)obj;
		return this.i == temp.i &&
			   this.j == temp.j &&
			   this.k==temp.k;
	}
}
