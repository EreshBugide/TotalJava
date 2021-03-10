package Pattern;

public class B {
	public static void main(String[] args) {
		for(int i = 0 ; i < 7; i++)
		{
//			System.out.print("*");
			for (int j = 0; j < 5; j++)
			{
				if (j==0 || (i%3==0 && j!=4) || (i%3>0 && j==4)) 
				{
					System.out.print("*"+" ");
				}
				else
					System.out.print("  ");
			}
//			for (int k = 0; k <= i; k++) 
//			{
//				if (i==0||) 
//				{
//					System.out.print("*");
//				}
//			}
			System.out.println("");
		}
	}
}
