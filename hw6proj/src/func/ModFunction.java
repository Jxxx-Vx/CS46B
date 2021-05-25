package func;

public class ModFunction implements DoubleFunctionOfTwoInts {
	
	public double	fOfXY(int x, int y) {
		int testY = y;
		if(y==0)
			testY = 1;
		return (x%testY);
	}
	
	public String	getName() {
		return "ModFunction";
	}

}
