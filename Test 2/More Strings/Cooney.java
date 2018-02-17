import java.util.Scanner;
public class Cooney{
	public static int consecWordCount=0;
	public static void main(String[] args){
		while(consecWordCount<5){
			takeAndCheck();
		}
		System.out.println("Congratulations, you figured it out!");
	}
	public static boolean hasConsec(String str){
		char temp = str.charAt(0);
		boolean returnTrue=false;
		for(int i = 1; i<str.length(); i++){
			if(temp==str.charAt(i)){
				returnTrue = true;
			}
			else{
				temp = str.charAt(i);
			}
		}
		if(returnTrue)
				return true;
			else
				return false;
	}
	public static void  takeAndCheck(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word you think Cooney likes:");
		String input = scan.nextLine();
		if(hasConsec(input)){
			consecWordCount++;
			String output = input.toUpperCase();
			System.out.println("Cooney likes " + output);
		}
		else{
			consecWordCount=0;
			String output = input.toUpperCase();
			System.out.println("Cooney doesn't like " + output);

		}
	}

}
