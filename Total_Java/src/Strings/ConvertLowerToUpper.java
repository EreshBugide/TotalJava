package Strings;

public class ConvertLowerToUpper
{
//	public static void main(String[] args) {
//		
//		String x = "ereshchandrakala";
//		char [] y = x.toCharArray();
//		int size = y.length;
//		int i=0;
//		while(i!=size)
//		{
//			y[i] = (char) (y[i]-32);
//			++i;
//		}
//		System.out.println(x);
//		System.out.println(y);
//	}
	
	
//	public static void main(String[] args) {
//		
//		String x = "eresh chandrakala";
//		char [] y = x.toCharArray();
//		int size = y.length;
//		int i=0;
//		while(i!=size)
//		{
//			if(y[i]!=' ')
//				y[i] = (char) (y[i]-32);
//			++i;
//		}
//		System.out.println(x);
//		System.out.println(y);
//	}
	
	public static void main(String[] args) {
		
		String x = "eresh chandrakala";
		char [] y = x.toCharArray();
		int size = y.length;
		y[0] = (char) (y[0]-32);
		int i=1;
		while(i!=size)
		{
			if(y[i] == ' ')
			{
				y[i+1] = (char) (y[i+1]-32);
				
			}
			++i;
		}
		System.out.println(x);
		System.out.println(y);
	}
}

