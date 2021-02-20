import java.util.Scanner;
class A1 
{
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size=s.nextInt();
		int []a=new int[size];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("enter the value for a[" + i +"]");
			a[i]=s.nextInt();
		}
		//to display the array
		System.out.println("the element of array is:");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
			
		}

	}
}
