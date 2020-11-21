package JavaActivity3_2;

import java.util.HashSet;

public class Activity3_2 {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("K");
		hs.add("R");
		hs.add("E");
		hs.add("D");
		hs.add("M");
		hs.add("S");
		System.out.println("Size of the hashset: " + hs.size());
		System.out.println("Original hashset is: " + hs);
		if(hs.remove("X")) {
			System.out.println("'X' was removed from the Hashset");
		}
		else {
			System.out.println("'X' was not found in the Hashset");
		}
		System.out.println("Whether 'G' is found in the hashset: " + hs.contains("G"));
		System.out.println("Whether 'S' is found in the hashset: " + hs.contains("S"));
		System.out.println("Removing 'M' from the hashset: " + hs.remove("M"));
		System.out.println("Updated hashset is: " + hs);
	}
	
}