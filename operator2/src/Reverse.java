class Reverse 
{

	public int[] revarry(int[] a){
	for(int i=0;i<a.length;i++){
	if(i%2 == 0){
	a[i]=0;
	}
	}
	return a;
	}
	public static void main(String[] args) 
	{
		Reverse rev = new Reverse();
		int b[] ={1,2,3,4,5};
		int c[] = rev.revarry(b);
		for(int i=0;i<c.length;i++){
			System.out.println(c[i]);
		}
		
	}
}
