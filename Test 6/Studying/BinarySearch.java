public class BinarySearch{
  public static void main(String[] args){
    int[] test = {0,1,2,3,4,5,6,7,8,9,10};
    System.out.println(recursive(test,12,0,10));
  }
  public static int recursive(int[] x, int target, int start, int end){
    int avg = (start+end)/2;
    int check = x[avg];
    if(check==target)
      return check;
    else if(check>target)
      return recursive(x,target,avg+1,end);
    else
      return recursive(x,target,start,avg-1);
  }
  public static void printArray(int[] arr){
    for(int i = 0; i<arr.length; i++)
      System.out.println(arr[i]+",");
  }
}
