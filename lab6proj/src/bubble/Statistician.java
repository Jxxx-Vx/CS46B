package bubble;

import java.util.*;


public class Statistician 
{
	private final static int N_REPETITIONS = 1000;
	
	private static void getStats(int arrayLength)
	{
		ArrayList<Long> visitCounts = new ArrayList<>();
		ArrayList<Long> swapCounts = new ArrayList<>();
		
		for (int i=0; i<N_REPETITIONS; i++)
		{
			int[] array = BubbleSortTestCaseMaker.buildRandom(arrayLength, arrayLength*100);
			BubbleSorter sorter = new BubbleSorter(array);
			sorter.sort();
			assert sorter.isSorted() : "Not Sorted Properly";
			
			visitCounts.add(sorter.getNVisits());
			swapCounts.add(sorter.getNSwaps());
			
		}
		long avgVisits = 0; 
		long avgSwaps = 0;
		
		for(int n = 0; n < visitCounts.size(); n++) {
			avgVisits += visitCounts.get(n);
			avgSwaps += swapCounts.get(n);
		}
		avgVisits /= visitCounts.size();
		avgSwaps /= swapCounts.size();
		
		System.out.println("Average Visit Counts: "+avgVisits);
		System.out.println("Average Swap Counts: "+avgSwaps);
		
	}
	
	
	public static void main(String[] args)
	{
		System.out.println("1000:");
		getStats(1000);
		
		System.out.println("3000:");
		getStats(3000);
	}
}
