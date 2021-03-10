package Type_Casting;

/*
 * their is a Tank with a capacity 1000 liters
 * the Tank is half filled with water
 * we need to empty the tank by pouring of the water into a bucket tumble of volume 20 l
 * WAP to find out number of bucket tumblers required to empty to water
 */
public class Tank 
{
	public static void main(String[] args) {
		
		double tank = 1000;
		double bucket = 20;
		double q = tank/2;
		int netBucket = (int)(q/bucket);
		System.out.println("the required no. of buckets is :"+netBucket);
	}
}
