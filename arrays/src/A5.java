/*write a prog to swap elements in an array for the given indexwithout using temp variable
*/
class A5 
{
	public static void main(String[] args) 
	{
		int []a={10,20,30,40};
		int i=1;
		int j=3;
		for (int k=0;k<a.length; k++ )
		{
           System.out.println(a[k]);
		}
		a[i]=a[i]+a[j];
		a[j]=a[i]-a[j];
		a[i]=a[i]-a[j];
		for (int k=0;k<a.length ;k++ )
		{
           System.out.println(a[k]);
		}

		
	}
}
