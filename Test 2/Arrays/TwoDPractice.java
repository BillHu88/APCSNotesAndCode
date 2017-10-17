public class TwoDPractice{
  public static void main(String[] args){
    int[][] test = {
      {1,1,1,1},
      {1,1,1,1},
      {1,1,1,1},
      {1,1,1,1},
    };
    System.out.println(liesOnDiagonal(test, 0,1));
  }
  public static boolean liesOnDiagonal(int[][] array, int x, int y){
    if(x==y)
      return true;
    else if(x==(array.length)-1)
      return true;
    else
      return false;
  }
  public static
}
