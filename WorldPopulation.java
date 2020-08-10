package co.standup;

public class WorldPopulation {

	public static void main(String[] args) {
		double worldPop = 7800000000.0;
		int presentYear = 2020;
		int count = 0;
		double currInc = 0;
		double currPop = worldPop;
		System.out.printf("%s%18s%18s%23s%n", "S/N", "Years", "World Pop", "CurrentInc");
//		while(presentYear <= 2095) {
//
//			count++;
//			System.out.printf("%2d%20d%20.2f%20.2f%n", count, presentYear, currPop, currInc);
//			currInc = currPop * 0.01;
//			currPop += currInc;
//			presentYear++;
			//System.out.println();
		//}
		for(int i = 2020; i<= 2095; i++) {
			count++;
			System.out.printf("%2d%20d%20.2f%20.2f%n", count, presentYear, currPop, currInc);
			currInc = currPop * 0.01;
			currPop += currInc;
			presentYear++;
			
		}
	//	if( (worldPop *2) >= 15600000000.0 || (worldPop *2) <= 15660000000.0) {
//			System.out.println("The population will be doubled the present pop by year " +presentYear);
//		}
		
	}
	
	
}
