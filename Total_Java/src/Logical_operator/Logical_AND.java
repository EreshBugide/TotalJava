package Logical_operator;
/*
 * AND Operator act like -->"if both statement are true the output will be true"
 * -->"if any one of statement false the output will be false"
 * -->"if first statement is true it will check further statement"
 * -->"if first statement is false it throws false no need to check to second statement"
 */
public class Logical_AND 
{
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int c = a<b && a++<b ? a:b;
		System.out.println(a<b && a++<b);//true
		System.out.println(a);//12
		System.out.println(b);//20
		System.out.println(c);//11
		
		
		int d = 10;
		int e = 20;
		int f = d<e && d++>e?d:e;
		System.out.println(d<e && d++>e);//false
		System.out.println(d);//10
		System.out.println(e);//20
		System.out.println(f);//20
	}
}
