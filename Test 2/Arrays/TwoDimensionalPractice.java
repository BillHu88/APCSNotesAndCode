public class TwoDimensionalPractice{
    public static void main(String[] args){
        int[][] test = {
            {1,1,1,1},
            {1,1,1,1},
            {1,1,1,1},
            {1,1,1,1}
        };
        System.out.println(onDiagonal(test, 3,1));
    }
    public static boolean onDiagonal(int[][] matrix, int i, int j){
        if(i==j){
            return true;
        }
        else if((matrix.length-1)-i==j){
            return true;
        }
        else{
            return false;
        }
    }
}