package bubble;

public class BubbleSorter 
{
	private int[]		a;
	private long		nVisits;
	private long		nSwaps;
	
	
	public BubbleSorter(int[] a)
	{
		this.a = a; 
	}
	
	
	public void sort()
	{
		int temp = 0;
		for (int n = 0; n < a.length; n++)
		{
			for (int i = a.length-1; i > 0; i--)
			{
				nVisits += 2;
				
				if (a[i] < a[i-1])
				{
					temp = a[i-1];
					a[i-1] = a[i];
					a[i] = temp;
					nSwaps++;
				}
			}
		}
	}
	
	
	public String toString()
	{
		String s = nVisits + " visits, " + nSwaps + " swaps\n{";
		for (int n: a)
			s += " " + n;
		s += " }";
		return s;
	}
	
	
	public boolean isSorted()
	{
		for(int n = 0; n < a.length-1; n++) {
			if(a[n] > a[n+1])
				return false;
		}
		return true;
	}
	
	
	public long getNVisits()
	{
		return nVisits;
	}
	
	
	public long getNSwaps()
	{
		return nSwaps;
	}
	
	
	public int[] getArray()
	{
		return a;
	}
	
	
	public static void main(String[] args)
	{
		int[] a = BubbleSortTestCaseMaker.buildRandom(100,1000);
		
		BubbleSorter sorter = new BubbleSorter(a);
		sorter.sort();
		System.out.println(sorter);
		System.out.println(sorter.isSorted()  ?  "SORTED"  :  "NOT SORTED");
	}
}
