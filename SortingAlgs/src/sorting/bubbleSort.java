package sorting;

public class bubbleSort {
	private int [] toBeSorted;
	
	public bubbleSort(int [] i) {
		toBeSorted = i;
	}
	
	public int [] sort() {
		
		int small = Integer.MIN_VALUE;
		int temp = 0;
		for(int n = 0; n < toBeSorted.length; n++) {
			for(int i = 0; i < toBeSorted.length; i++) {
				if(small > toBeSorted[i]) {
					small = toBeSorted[i];
				}
				temp = toBeSorted[n];
				
			}
		}
		
		
		
		return toBeSorted;
	}
}
