package JavaActivity2_3;

public class Activity2_3 {
	
	public static void main(String args[]) {
		MountainBike mb1 = new MountainBike(5,25,10);
		System.out.println(mb1.bicycleDesc());
		mb1.speedUp(10);
		mb1.applyBrake(15);
	}
	
}