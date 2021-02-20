//remove dulicate
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.Set;
class K3
{	
	
	public static void main(String[] args) 
	{
		String str="java programming";
		System.out.println(duplicate(str));

		

	}
	public static String duplicate(String str)
	{
		Set<Character> set=new HashSet<Character>();
        StringBuffer sb=new StringBuffer();

		for(int i=0;i<str.length();i++)
		{
			Character c=str.charAt(i);
			if(!set.contains(c))
			{
				set.add(c);
				sb.append(c);
			}
		}
		return sb.toString();
	}
		


}
