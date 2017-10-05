public class Palindrome{
	public static void main(String[] args){
		
	}
	public static boolean isPalindrome(String word){
		StringBuffer buffer = new StringBuffer(word);
		for(int i = 0; i<buffer.length(); i++){
			if(!Character.isLetterOrDigit(buffer.charAt(i))){
				buffer.deleteCharAt(i);
				i--;
			}
			else{

			}
		}
		String orig = buffer.toString();
		buffer.reverse();
		String newStr = buffer.toString();
		if(orig.equalsIgnoreCase(newStr)){
			System.out.println("true");
			return true;
		}
		else{
			System.out.println("false");
			return false;
		}
	}
}