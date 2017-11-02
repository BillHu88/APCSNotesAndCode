public class InsertionPractice{
    public static void main(String[] args){

    }
    public static void rotateLeft(int[] a){
        
    }
    public static void rotateRight(int[] a){
        int[] last = int[(a.length-1)];
        for( int index =a.length-2; index >= 0 ; index-- )
            a[index+1] = a[index];
        a[0] = last;
        System.out.print("\nshifted Array: " + Arrays.toString(a) );
    }
}