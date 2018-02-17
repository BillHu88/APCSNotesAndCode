import java.util.Scanner;
public class binaryhw{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("enter number to be mod 16");
    double num = scan.nextDouble();
    System.out.println(num%16);
  }
}
