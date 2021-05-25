package space;

import java.util.ArrayList;


public class Mission implements Comparable<Mission>
{
	private String			destination;
	private float			cost;
	
	
	public Mission(String destination, Float cost)
	{
		this.destination = destination;
		this.cost = cost;
	}
	
	
	public String getDestination()
	{
		return destination;
	}
	
	
	public float getCost()
	{
		return cost;
	}


	// Compare by cost, then by destination.
	public int compareTo(Mission that) 
	{ 		
		if(this.cost < that.getCost()) {
			return -1;
		}
		else if(this.cost > that.getCost())
			return 1;
		
		else {
			return this.destination.compareTo(that.getDestination());
		}
	}
	
	
	// Let compareTo() do the work. This method should just be 1 line.
	public boolean equals(Object x)
	{
		Mission m = (Mission)x;
		return (this.compareTo(m) == 0);
	}
	
	
	// Return the destination’s hash code.
	public int hashCode()
	{
		return destination.hashCode();
	}
	
	
	public String toString()
	{
		return "Mission to " + destination + " will cost " + cost;
	}
	
	public static void main(String [] args) {
		
		
		float f1 = 200;
		Mission m = new Mission("Moon", f1);
		
		Mission m2 = new Mission("Moon", f1);
		
		if(m.equals(m2))
			System.out.println("Works");
		
		System.out.println(m.hashCode());
		System.out.println(m2.hashCode());
		
	}
}
