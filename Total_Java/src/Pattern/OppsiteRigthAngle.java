package Pattern;

public class OppsiteRigthAngle 
{
	public static void main(String[] args) {
		
		
		for (int i = 1; i < 5; i++) 
		{
			for (int k = 4; k >= i; k--) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
