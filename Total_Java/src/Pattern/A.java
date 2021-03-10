package Pattern;

import java.util.Scanner;

public class A 
{
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
		
		for (int i = 0; i <6; i++) 
		{
			for (int j =6; j > i; j--) 
			{
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++)
			{
				if (k==0 || i==3 || k==i)
				{
					System.out.print(" "+ (char)65);
				}
				else
					System.out.print("  ");
			}
			System.out.println("");
		}
	}
}
