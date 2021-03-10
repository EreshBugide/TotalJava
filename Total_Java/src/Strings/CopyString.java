package Strings;

/*
 * Create a string object with x as the reference.
 * Extract the data from string object and place it in a character array y.
 * Compute length of array y.
 * Create a new array a with its same size as y.
 * Create index veriable i and initialize to 0.
 * copy the data from y array into a array.
 * print the result.
 */
public class CopyString
{
	public static void main(String[] args) {
		
		String x = "EreshChandrakala";
		char[] y = x.toCharArray();
		int size = y.length;
		char [] a = new char[size];
		int i=0;
		while (i != size) 
		{
			a[i] = y[i];
			++i;
		}
//		System.out.println(size);
		System.out.println(y);
		System.out.println(a);
	}
}
