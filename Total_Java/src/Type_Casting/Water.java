package Type_Casting;

/*
 * their is a jug with a capacity 2.2 liters
 * the jug is half filled with water
 * we need to empty the jug by pouring of the water into a glass tumble of volume 200ml
 * WAP to find out number of glass tumblers required to empty to water
 */

public class Water {

	public static void main(String[] args) {
		
		double jug = 2.2;//in liters
		int glassTambuler = 200;//in ml
		double q = jug/2;
		int netTembler = (int) ((q*1000)/glassTambuler);
		System.out.println("The no.of temblers to required is :"+netTembler);
	}
}
