class D3 extends D2 
{
	boolean m;
	char n;
	D3()
	{
	}
	D3(int i,int j,int k,double l,boolean m,char n)
	{
		super(i,j,k,l);
		this.m=m;
		this.n=n;
	}
	public boolean equals(Object obj)
	{
		D3  temp=(D3) obj;
		return super.equals(temp) &&
		   this.m==m
		&&this.n==n;
	}
}
