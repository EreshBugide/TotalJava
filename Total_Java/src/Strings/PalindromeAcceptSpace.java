package Strings;

public class PalindromeAcceptSpace
{
	public static void main(String[] args) {
		
		String x = "too hot to hoot";
		x=x.replace(" ", "");
		char [] y = x.toCharArray();
		int size = y.length;
		char [] a = new char[size];
		int i=0;
		while( i!=size )
		{
			a[size-1-i] = y[i];
			++i;
		}
				
		i=0;
		while(i!=size)
		{
			if (a[i]!=y[i])
			{
				System.out.println("It is not a palindrome");
				System.exit(0);
			}
			else
			{
				++i;
				continue;
			}
		}
		System.out.println("It is a palindrome");
		
	}
}
