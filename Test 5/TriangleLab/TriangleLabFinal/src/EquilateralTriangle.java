
public class EquilateralTriangle extends Triangle{
	
	//private double side;
	
	public EquilateralTriangle(double side) {
		super(side);
		//this.side=side;
	}

	public double getPerimeter() {
		
		return 3*getSide();
	}

	
	public double getArea() {
		return (Math.sqrt(3)/4)*Math.pow(getSide(), 2);
	}
	
}
