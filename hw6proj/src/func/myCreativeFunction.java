package func;

public class myCreativeFunction implements DoubleFunctionOfTwoInts {
	
	public double	fOfXY(int x, int y) {
		if(y==0)
			y=1;
		if(x==0)
			x=1;
		
		return Math.hypot(x%y, y%x);
	
	}
	public String	getName() {
		return "myCreativeFunction";
	}

}
