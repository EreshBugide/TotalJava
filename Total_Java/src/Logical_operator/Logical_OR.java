package Logical_operator;

/*
 * OR Operator act like -->"if both are false the output will be false"
 * -->"if any one of statement True the output will be True"
 * -->"if first statement is True it will not check further statement directly the output is True"
 * -->"if first statement is false it will check to second statement"
 */
public class Logical_OR 
{
	public static void main(String[] args) {
		
		int a = 10,b = 20;
		int c = a<b || a++<b ? a : b;
		System.out.println(a<b || a++<b);//true
		System.out.println(a);//10
		System.out.println(b);//20
		System.out.println(c);//10
		
		
		int d = 10,e = 20;
		int f = d>e || d++<e ? d : e;
		System.out.println(d>e || d++<e);//true
		System.out.println(d);//12
		System.out.println(e);//20
		System.out.println(f);//11
	}
}
