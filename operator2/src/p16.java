class p16 
{
	public static void main(String[] args) 
	{
		boolean t=true;
		first:
		{
			second:
			{
				third:
				{
					System.out.println("before break statement");
					if(t)
						break second;
					System.out.println("this statement wont be executed");
				}
				System.out.println("this statement wont be executed");
			}
			System.out.println("this after the second block");
		}



	}
}
