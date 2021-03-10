package DataTypes;

class D
{
	public static void main(String[] args) 
	{
		{
			int a=1;
			System.out.println("Inner block :"+a);//1
		}
		System.out.println("outter Block  :"+a);//CTE: instance variable declared inside the Block we cannot call outside block
	}
}
