/*     *
      *** 
     *****
	  ***
	   *
     
*/
class p22
{
	public static void main(String[] args) 
	{
		int n=5;
		int ch=1;
		int sp=n/2;
	
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<sp;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<ch;j++)
			{
				System.out.print("*");
			}
		
	       	System.out.println();
		    if(i<n/2)
			{
		     ch=ch+2;
		     sp--;
			 
			}
			else
			{
				ch=ch-2;
			     sp++;
			}
				
		}
		}
	}

