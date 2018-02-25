/**
 * 
 * @author Derfel Terciano
 * @version 1
 */
public abstract class ThreeDShape {
	private double volume;
	private double surfaceArea;

	public ThreeDShape() {
		//TODO ask why this constructor doesn't work
		volume = calcVolume();
		surfaceArea = calcSA();
	}

	// Can you write this code for this class or does it need to be overridden by
	// every subclass?
	public abstract double calcVolume();

	// Can you write this code for this class or does it need to be overridden by
	// every subclass?
	public abstract double calcSA();
	
	public double getVolume() {
		volume = calcVolume();
		return round2(volume);
	}
	public double getSA() {
		surfaceArea = calcSA();
		return round2(surfaceArea);
	}
	
	
	public double round2(double num) {
		double x = (num - num % 0.001) * 1000;
		if (x % 10 >= 5) {
			x += 10;
			return (x - x % 10) / 1000;
		} else {
			return (x - x % 10) / 1000;
		}
	}
}
