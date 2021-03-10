package Pattern;

public class Art 
{
	public static void main(String[] args) {
		
		for (int i = 0; i < 13; i++) 
		{
			
//			if(i==3||i==9)
//			{
//				System.out.print("* ");
//			}
			for (int j = 0; j < 11; j++) 
//			{
////				System.out.print(" ");
////			}
////			for(int k=0;k<=i;k++)
			{
				if (j%6==0)
				{
					System.out.print("* ");
				}
//				else 
//					System.out.println(" "+" ");
			}
			System.out.println();
			
		}
	}
}
