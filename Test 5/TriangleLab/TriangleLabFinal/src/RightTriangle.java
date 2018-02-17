
public class RightTriangle extends Triangle{
	
	//private double side;
	
	public RightTriangle(double side) {
		super(side);
		//this.side=side;
	}

	public double getPerimeter() {
		double c=Math.sqrt(Math.pow(getSide(), 2)+Math.pow(getSide(),2));
		return getSide() + getSide() + c;
	}

	
	public double getArea() {
	    return (getSide()*getSide())/2;
	}
	
}
