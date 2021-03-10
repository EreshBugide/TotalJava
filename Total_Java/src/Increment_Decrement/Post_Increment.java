package Increment_Decrement;

class Post_Increment 
{
	public static void main(String[] args) 
	{
		int a=10;
		System.out.println("result is :"+ a++);//10
		System.out.println(a);//11

		int b=25;//here "25" is a low priority
		b=20;//High priority
		//b=20++;//CTE
		b++;
		System.out.println(b);
	}
}
