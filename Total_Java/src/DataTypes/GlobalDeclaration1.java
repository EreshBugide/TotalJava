package DataTypes;

class GlobalDeclaration1 
{
	static int a=3;
	//a=2;//CTE static variable cannot initalation separatly
	public static void main(String[] args) 
	{
		//a=2;
		System.out.println(a); //static variable can be refered inside the static context
	}
}
