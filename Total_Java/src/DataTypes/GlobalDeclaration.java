package DataTypes;

// non-static variable a cannot be referenced from a static context

class GlobalDeclaration 
{
	int a=1;
	//a=3;
	public static void main(String[] args) 
	{
		//a=1;
		System.out.println(a);
	}
}
