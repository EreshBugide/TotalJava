package Logical_operator;

/*
 * NOT Operator act like -->"the input statement is true the output statement will be false"
 */
public class Logical_NOT
{
	public static void main(String[] args) {
		
		int a = 10,b = 20;
		int c = a<b || a++<b ? a : b;
		System.out.println(!(a>b));//true
		System.out.println(a);//10
		System.out.println(b);//20
		System.out.println(c);//10
		
		
		int d = 10,e = 20;
		int f = a<b || a++<b ? a : b;
		System.out.println(!(a<b));//false
		System.out.println(a);//10
		System.out.println(b);//20
		System.out.println(c);//10
	}
}
