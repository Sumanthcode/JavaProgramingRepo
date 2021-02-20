// find duplicate
import java.util.Scanner;
class K1
{

	public static void main(String[] args) 
	{
		int []a={1,2,3,5,5,7,6};
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[j]);
				}
			}
		}
		
	}

}
