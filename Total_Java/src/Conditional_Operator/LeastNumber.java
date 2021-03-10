package Conditional_Operator;

public class LeastNumber 
{
	public static void main(String[] args) {
		
		int a=10,b=20,c=30;
		int leastNumber = a<b?(a<c?a:c):(b<c?b:c);
		System.out.println(leastNumber);
	}
}
