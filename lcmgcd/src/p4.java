
/*
write a prog to count no. of digit in a num
*/
class p4 
{
	public static void main(String[] args) 
	{
		int num=20453445;
		int temp=num;
		int count=0;
		while(temp>0)
		{
			temp /= 10;
			count++;
		}
		System.out.println("no. of digit is:"+ count);
	}
}
/*assignment
design a method which can accept a num and returns no. of digit in it.