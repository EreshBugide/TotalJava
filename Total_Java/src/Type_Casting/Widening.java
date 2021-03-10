package Type_Casting;

public class Widening 
{
	public static void main(String[] args) {
		
		int a = 'a';//char to int widening
		System.out.println(a);
		
		char ch = 'a';
		int b = ch;//char to int widening
		System.out.println(b);
		
		long l = a;//int to long widening
		System.out.println(l);
		
		float f = a;//int to float widening
		System.out.println(f);
		
		double d = a;//int to double widening
		System.out.println(d);
	}
}
