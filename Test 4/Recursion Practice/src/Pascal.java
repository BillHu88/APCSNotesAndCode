import java.util.Scanner;

public class Pascal {
	
	public static void main(String[] args) {
		//promptAndFactorial();
		//promptAndExponent();
		promptAndPascal();
		//writeBinary(44);
	}
	
	public static void promptAndFactorial(){
		System.out.println("Please enter your number");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		System.out.println(input+"!="+factorial(input));
	}
	
	public static int factorial(int n) {
		if(n<=1)
			return 1;
		else
			return n*factorial(n-1);
	}
	
	public static void promptAndExponent() {
		System.out.println("Please enter your number");
		Scanner yeet = new Scanner(System.in);
		int input = yeet.nextInt();
		System.out.println("2^"+input+"="+exponent(input));
	}
	
	public static int exponent(int n) {
		if(n<1)
			return 1;
		else
			return 2*exponent(n-1);
	}
	
	public static void promptAndPascal() {
		Scanner scanner = new Scanner(System.in);
	    System.out.print("Please enter your target row");
	    int targetRow = scanner.nextInt();
	    pascal(targetRow);
	}
	
	public static void pascal(int n) {
	       int[] prevRow;
	       int[] row = {1};
	       printTheTriangle(row);
	       prevRow = row;
	       for (int i = 2; i <= n; i++) {
	           row = new int[i];
	           row[0] = 1;
	           row[i - 1] = 1;
	           for (int j = 0; j <= i - 3; j++) {
	               row[j + 1] = prevRow[j] + prevRow[j + 1];
	           }
	           printTheTriangle(row);
	           prevRow = row;
	       }
	   }

	   public static void printTheTriangle(int[] array) {
      //PerGra: GRC
           for (int i = 0; i < array.length; i++) {
	    	  
	    		   System.out.print(array[i] + "\t");
	       }
	       
	       System.out.println();
	   }
	   

	public static String binary(int i){
		if(i==1){
			return "1";
		}
		else{
			int temp = i%2;
			return binary(i/2)+temp;
		}
	}

	public static void writeBinary(int input){
		System.out.println(binary(input));
	}
}
