package Decision_Statements;

public class Nested_If 
{
	public static void main(String[] args) {
		
		int a=10,b=8,c=30;
		if (a<=b) 
		{
			System.out.println("a<=b condition is true");
			if (a==c)
			{
				System.out.println("a==c condition is true");
			}
			else
				System.out.println("a==c condition is false");
		}
		else
			System.out.println("a<=b condition is false");
	}
}
