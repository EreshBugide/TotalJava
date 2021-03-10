package DataTypes;


class VariableDeclare 
{
	public static void main(String[] args) 
	{
		int a='c';
		System.out.println(a);//99
		
		int a=10;
		System.out.println(a);//CTE-->"variable a is already defined in method main(String[])"
	}
}
