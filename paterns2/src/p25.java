/*a    
 aba
abcba
 aba
  a
     
*/
class p25
{
	public static void main(String[] args) 
	{
		int n=5;
		int ch=1;
		int sp=n/2;
		//char b='a';
	
		for(int i=0;i<n;i++)
		{
			char b='a';
			for(int j=0;j<sp;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<ch;j++)
			{
				System.out.print(b);
				if(j<ch/2)
				{
					b++;
				}
				else
					b--;
			}
			
		
	       	System.out.println();
			
		    if(i<n/2)
			{
				sp--;
				ch=ch+2;
			}
			else
			{
				sp++;
				ch=ch-2;
			}
		     
		}
		}
	}

