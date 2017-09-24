import java.util.Scanner;
public class CircleTest{
  public static void main(String[] args){

    Circle test = new Circle(3);
    System.out.println(test.radius);

    System.out.println("Enter the radius:");
    Scanner scan = new Scanner(System.in);
    double inputRadius = scan.nextDouble();
    Circle circ = new Circle(inputRadius);
    double calcArea = circ.getArea();
    System.out.println("The area of a circle with radius " + inputRadius  + " is " + calcArea);
  }
}
