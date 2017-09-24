public class RecapLab{
  public static void main(String[] args){
    int sum = 0;
for (int i = 2; i < 20; i+=3)
sum += i;
System.out.print(sum);

  }


  public static void arrayMystery(int[] a) {
for (int i = 1; i < a.length; i++) {
a[i] = i + a[i - 1] - a[i];
}
}
}
