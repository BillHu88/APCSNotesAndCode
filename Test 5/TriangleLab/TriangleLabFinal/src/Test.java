
public class Test {

	public static void main(String[] args) {
		Triangle equilateralTr = new EquilateralTriangle(12);
		Triangle rightTr = new RightTriangle(12);
		System.out.println("Equilateral " + equilateralTr.getRatio());
		System.out.println("Right isosceles " + rightTr.getRatio());
		System.out.println("Right isosceles triangle can hold a bigger circle inside");
	}
}
