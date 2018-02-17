import java.util.Scanner;
public class CylinderTest{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the radius for the base of the cylinder:");
    int inputRadius = scan.nextInt();
    System.out.println("Enter the height for the cylinder:");
    int inputHeight = scan.nextInt();
    Cylinder cyl = new Cylinder(inputRadius, inputHeight);
    double vol = cyl.getVolume();
    System.out.println(vol);
  }
}
