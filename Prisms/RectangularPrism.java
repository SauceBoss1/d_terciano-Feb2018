/* Write this concrete (non-abstract) class called RectangularPrism.  
 * It has 2 private fields (length and width).
 * It inherits its height from its superclass, Prism (because all prisms have a height).
 * Provide a constructor and the methods required by its abstract superclass.  
 */

/**
 * calculates the perimeter and area of the base of a cylinder
 * @author Derfel Terciano
 * @version 0.1
 */

public class RectangularPrism extends Prism {
	private int length;
	private int width;
	
	public RectangularPrism(int length, int width, int height) {
		super(height);
		this.length=length;
		this.width=width;
	}
	
	public double calcAreaOfBase() {
		return length * width;
	}
	
	public double calcPerimeter() {
		return (2*length)+(2*width);
	}
	
	
}

