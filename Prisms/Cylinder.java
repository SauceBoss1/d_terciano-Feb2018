/* Write this concrete (non-abstract) class called Cylinder that extends Prism.  
 * It has a private field (radius) and inherits its height from its superclass, Prism 
 *    (because all prisms have a height).
 * Provide a constructor and the methods required by its abstract superclass.  
 */

/**
 * calculates the perimeter and area of the base of a cylinder
 * @author Derfel Terciano
 * @version 0.1
 */

public class Cylinder extends Prism {
	private double radius;
	final double pi = 3.14159265359;
	
	public Cylinder(double radius,int height) {
		super(height);
		this.radius=radius;
	}
	
	public double calcPerimeter() {
		return 2*pi*radius;
	}
	
	public double calcAreaOfBase() {
		return round2(pi * (radius*radius));
	}
	
	
	
}
