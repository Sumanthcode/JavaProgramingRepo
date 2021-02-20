/*write a prog to obtain highest value in an integer array
*/
//import java.util.Scanner;
class A3 
{
	public static void main(String[] args) 
	{
		//Scanner s=new Scanner();
		int []a={10,-20,30};
		int large=a[0];//assumtion
		for(int i=1;i<a.length;i++)
		{
			if(large<a[i])
			{
				large=a[i];
				
			}
			
		}

		System.out.println(large);
	}
}
