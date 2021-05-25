package mapminilabproj;
import java.util.*;

public class MapMiniLab {
	private final static String[]      PLANETS ={"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
	private final static int[]               DISTANCES_FROM_SUN ={36, 67, 93, 141, 484, 891, 1784, 2793};
	public static void main(String[] args){
		/* * Print a list of planets, ordered by distance from the sun: * Mercury is 36 million miles from the sun * 
		 * Venus is 67 million miles from the sun * etc *  * Use a TreeMap. If the way forward isn't obvious, ask yourself these questions: *
		 *  1) What should the map's keys be? *
		 *  2) What should the map's values be? * 
		 *  3) What is the best possible name for your map? * 
		 *  4) A TreeMap has keys and values. Your loop can iterate over one or the other. Which is correct? * 
		 *  5) In your loop, how do you get a planet's name? How do you get its distance from the sun? *  */
		
		TreeMap <Integer, String> distanceToPlanet = new TreeMap <Integer, String> ();
		
		for(int n = 0; n < PLANETS.length; n++) {
			distanceToPlanet.put(DISTANCES_FROM_SUN[n], PLANETS[n]);
		}
		
		for(Integer dist: distanceToPlanet.keySet()) {
			System.out.println(distanceToPlanet.get(dist)+ "is "+ dist+" miles away from the sun.");
		}
		
		
	}
}

