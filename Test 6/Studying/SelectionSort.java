import java.util.Arrays;
import java.util.ArrayList;
public class SelectionSort{
  public static void main(String[] args) {
    int[] test = {4,2,1,9,0,7,10,5,8,3,6};
    System.out.println(Arrays.toString(iterativeTwo(test)));
  }
  public static int[] iterative(int[] x){
    int n = x.length-1;
    while(n>1){
      int maxPos = 0;
      for(int k = 1; k<n; k++){
        if(x[maxPos]<x[k])
          maxPos=k;
      }
      int temp = x[maxPos];
      x[maxPos]=x[maxPos];
      x[maxPos]=temp;
      n--;
    }
    return x;
  }

  public static int[] iterativeTwo(int[] x){
    int n = x.length-1;
    while(n>1){
      int maxPos = 0;
      for(int k = 1; k<n; k++){
        if(x[maxPos]<x[k])
          maxPos=k;
      }
      int temp = x[n-1];
      x[n-1]=x[maxPos];
      x[maxPos]=temp;
      n--;
    }
    return x;
  }

  public void selection(int[] arr){
    int n = arr.length-1;
    while(n>1){
      int maxPos = 0;
      for(int k = 1; k<n; k++){
        if(arr[maxPos]<arr[k])
          maxPos = k;
      }
      int temp = arr[n-1];
      arr[n-1]=arr[maxPos];
      arr[maxPo]s = temp;
    }
  }
}
