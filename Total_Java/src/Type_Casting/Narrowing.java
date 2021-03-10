package Type_Casting;

public class Narrowing
{
	public static void main(String[] args) {
		
		int a = 97;
//		char ch = a; //here we get CTE "int to char narrowing" thats why we get CTE 
//		System.out.println(ch);
		
		char ch1 = (char)a;
		System.out.println(ch1);
		
		double d = a ;//int to double widening
		System.out.println(d);
		
		float f = (float)d; //double to float narrowing 
		System.out.println(f);
		
		int c = 150;
		byte b = (byte)c;//int to byte narrowing
		System.out.println(c);
		System.out.println(b);//here data loss is occur
		
	}
	
	
}
