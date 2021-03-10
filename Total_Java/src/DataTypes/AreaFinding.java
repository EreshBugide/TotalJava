package DataTypes;

class AreaFinding 
{
	public static void main(String[] args) 
	{
		int a=10;
		{
			System.out.println("Inner Block :"+a);//10
		}
		System.out.println("Outer Block :"+a);//10
	}
}
