package weather;
import java.util.*;

public class Sky2 extends ArrayList<Cloud> {
	
	public Sky2() {
		super();
	}
	
	public float getMeanHeight() {
		float sum = 0;
		for(Cloud c: this) {
			sum += c.getHeight();
		}
		sum /= this.size();
		return sum;
	}
}
