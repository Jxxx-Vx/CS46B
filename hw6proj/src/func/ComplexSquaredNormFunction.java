package func;

public class ComplexSquaredNormFunction implements DoubleFunctionOfTwoInts {
	
	public double	fOfXY(int x, int y) {
		
		Complex c = new Complex(x,y);
		Complex duplicate = new Complex(x,y);
		
		Complex multiplied = Complex.multiply(c, duplicate);
		
		return multiplied.norm();
	}
	
	public String	getName() {
		return "ComplexSquaredNormFunction";
	}

}
