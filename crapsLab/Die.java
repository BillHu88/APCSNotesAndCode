public class Die{
  private int randNum;



  public void roll(){
    int min = 1;
    int range = (6 - 1) + 1;
    randNum = (int)(Math.random() * range) + min;
  }

  public int getNumDots(){
    return randNum;
  }
}
