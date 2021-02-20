import java.util.Scanner;
class p1
{

	static int s=10;

	public static void main(String[] a)
	{


		int num;
		s = 15;
		System.out.println(s);

	p1 ppp= new p1();
	ppp.nav();

        Scanner s = new Scanner(System.in);
		System.out.println("Insert num value");
		num = s.nextInt();
		switch(num%7)
		{
			case 0: System.out.println("sunday");
			break;
			case 1: System.out.println("monday");
			break;
			case 2: System.out.println("tuesday");
			break;
			case 3: System.out.println("wednesday");
			break;
			case 4: System.out.println("thursday");
			break;
			case 5: System.out.println("friday");
			break;
			case 6: System.out.println("satuarday");
			break;
		}
	}

    int ss=30;
	public void nav(){
	s=20;
	System.out.println(s);
	}
}