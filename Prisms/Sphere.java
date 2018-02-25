/**
 * 
 * @author Derfel Terciano
 * @version 1
 */
public class Sphere extends ThreeDShape{
	private double radius;
	final double pi=3.14159265359;
	
	public Sphere(double radius) {
		super();
		this.radius=radius;
		
	}
	
	public double calcVolume() {
		return (4/3)*pi*exponent(radius,3);
	}
	
	public double calcSA() {
		return 4*pi*exponent(radius,2);
	}
	
	private double exponent(double number,int power) {
		double result =1.0;
		for(int i = 0; i<power;i++) {
			result*=number;
		}
		return result;
	}
	

}
