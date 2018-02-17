public class DieTest{
  public static void main(String[] args){
    Die die = new Die();
    for(int i=0;i<=100;i++){
    die.roll();
    System.out.print(die.getNumDots()+"\t");
  }
  }
}
