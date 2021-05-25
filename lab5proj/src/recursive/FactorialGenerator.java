package recursive;

public class FactorialGenerator {

	public double nthFactorial(int n) {
		return computeFactorialRecurse(n);
	}
	
	public double computeFactorialRecurse(int n) {
		assert n  >= 0 : "Illegal n: " + n;
		if(n == 0)
			return 1;
		return n * computeFactorialRecurse(n-1);
	}
	
	public static void main(String [] arg) {
		
		
		FactorialGenerator fg = new FactorialGenerator();
		//long factorial = fg.nthFactorial(6);
		//System.out.println(factorial);
		fg.nthFactorial(-1);
		
		for(int n = 1; n < 33; n++) {
			System.out.println(fg.nthFactorial(n)+" " + n);
		}
		
		System.out.println("\n "+ Long.MAX_VALUE);
		
	}
	
	
}
