/* Write this abstract class called Prism.  It has one private field (height) and a constructor.  
 * It contains the methods calcAreaOfBase, calcPerimeter, calcVolume, and calcSA.
 * None of these methods require parameters.   
 * A couple are abstract - can you tell which ones and why?
 * 
 * Math note:
 * The volume of any prism can be found by multiplying the area of the base by the height.
 * The surface area of any prism can be found by multiplying the perimeter of the base by the height
 *   and then adding on the areas of the 2 bases.
 */

/**
 * Super class for all the other Prisms. Some of the available methods are abstract
 * <p>This method has a private field of height
 * @author Derfel Terciano
 * @version 0.1
 */


public abstract class Prism {
	private int height;
	
	public Prism (int height) {
		this.height=height;
	}
	
	public abstract double calcAreaOfBase();
	public abstract double calcPerimeter();
	
	public double calcVolume() {
		return round2(calcAreaOfBase() * height);
	}
	
	public double calcSA() {
		return round2(calcPerimeter() * height) + (2*calcAreaOfBase());
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
	