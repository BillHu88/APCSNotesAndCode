import java.util.Arrays;
import java.util.ArrayList;
public class Insertion{
  public static void main(String[] args){
    int[] test = {4,2,1,9,0,7,10,5,8,3,6};
    ArrayList<String> letters = new ArrayList<String>();
    letters.add("a");
    letters.add("b");
    letters.add("c");
    letters.add("d");
    letters.add("e");
    letters.add("f");
    letters.add("g");
    letters.add("h");
    letters.add("i");
    letters.add("j");
    letters.add("k");
    letters.add("l");
    System.out.println((sort(letters)).toString());
  }
  public static ArrayList<String> sort(ArrayList<String> x){
    for(int i = 1; i<x.size(); i++){
      String temp = x.get(i);
      int j = i;
      while(j>0 && (x.get(j-1).compareTo(temp)>=1)){
        x.set(j, x.get(j-1));
        j--;
      }
      x.set(j, temp);
    }
    return x;
  }

  public static void InsertionSort(int[] arr){
    for(int i = 1; i<arr.length; i++){
      int temp = arr[i];
      int j = i;
      while(j>0 && arr[j-1]<temp){
        x[j]=x[j-1];
      }
      x[j]=temp;
    }
    return x;
  }


}
