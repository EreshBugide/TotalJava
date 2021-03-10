package Strings;

public class UsingLength 
{
	public static void main(String[] args) {
		
		
		String x = "EreshChandrakala";
		x=x.concat("\0");
		char y[] = x.toCharArray();
		
		int count = 0;
		int i = 0;
//		System.out.println(y);
		while (y[i] != '\0') 
		{
			++count;
			++i;
			
		}
		System.out.printf("%d",count);
		
		
//		String x = "EreshChandrakala";
//		System.out.print(x.length());
	}
}
