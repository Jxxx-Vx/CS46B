package func;




public class HypotFunction implements DoubleFunctionOfTwoInts {

	public double	fOfXY(int x, int y) {
		return Math.hypot((double)x, (double)y);	
	}
	public String	getName() {
		return "HypotFunction";
	}
}
