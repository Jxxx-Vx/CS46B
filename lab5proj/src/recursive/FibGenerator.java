package recursive;

public class FibGenerator {
	private int [] callCounter;

	public int nthFib(int n) {
		callCounter = new int [n+1];
		return computeFibRecurse(n);
	}
	
	private int computeFibRecurse(int n) {
		callCounter[n]++;
		if(n == 1 || n == 2)
			return 1;
		return n + computeFibRecurse(n-1);
	}
	
	public void printCallCounter() {
		for(int n = 0; n < callCounter.length; n++) {
			System.out.println(callCounter[n]+" calls to fib("+n+")");
		}
	}	
	public static void main(String [] arg) {
		
		System.out.println("STARTING");
		
		FibGenerator fg = new FibGenerator();
		/*
		for(int n = 500; n < 520; n++)
			System.out.println(fg.nthFib(n));
			*/
		System.out.println(fg.nthFib(3));
		fg.printCallCounter();
	}
}
