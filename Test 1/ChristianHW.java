/*
*Pratham Gandhi
*/
public class ChristianHW{
	public static void main(String[] args){
		//String test = removeDashes("987-65-4321");
		//String test = scroll("Christian");
		//System.out.println(test);
	}
	public static String scroll(String str){
		char fChar = str.charAt(0);
		String subStr = str.substring(1);
		String newStr = subStr+fChar;
		return newStr;
	}
	public static String removeDashes(String str){
		//3,6
		StringBuilder newString = new StringBuilder(str);
		newString.deleteCharAt(3);
		newString.deleteCharAt(5);
		String endString = newString.toString();
		return endString;
	}
}