public class Circle{
  private double radius;
  public Circle(double r){
    getRadius(r);
  }

  public void getRadius(double rad){
    this.radius = rad;
  }

  public double getArea(){
    double area = Math.PI*(Math.pow(radius,2));
    return area;
  }
}
