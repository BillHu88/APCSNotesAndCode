import java.util.ArrayList;
public class LipogramAnalyzer{
	public String text;
	public static int charCount;
	public static String listWords = "";
	public static void main(String[] args){
	}
	public LipogramAnalyzer(String text){
		this.text = text;
	}
	public String mark (char letter){
		String newString=text.replace(letter,'#');
		return newString;
	}
	public String allWordsWith(char letter)
	{
		String list = "";
		ArrayList<String> offendingWords = new ArrayList<String>();
		int lastLetterChecked=0;
		text+=" ";
		
		for(int iteration=0;iteration<text.length();iteration++){
			String currentWord="";
			char targetChar=text.charAt(iteration);
			if(!Character.isLetterOrDigit(targetChar)&&target!='\''&&target!='-'){
				currentWord=text.substring(lastLetterChecked,iteration);
				offendingWords.add("");
				if(currentWord.indexOf(letter)!=-1){
					currentWord=currentWord.trim();
					for(int j=0;j<offendingWords.size();j++){
						if(offendingWords.indexOf(currentWord)==-1){
							offendingWords.add(0, currentWord);
							list+=currentWord+'\n';
						}	
					}
				}
				lastLetterChecked=iteration;
			}
		}
		return list.trim();
	}


	//I was planning on using this method after I isolated a word withing allWordsWith(), but then I found a much more effecient way of doing all of this withing allWordsWIth()
	/*
	public static boolean checkWord(String word, char letterMain){
		boolean returnTrue = false;
		char currentLetter='a';
		for(int i=0;i<=word.length()-1;i++){
			currentLetter = word.charAt(i);
			if(currentLetter==letterMain){
				System.out.println("word has the target char");
				returnTrue = true;
				System.out.println("current: " + currentLetter);
				listWords += "\n";
				listWords += word;
				break;
			}
			else{
				System.out.println("current: " + currentLetter);
			}
			charCount++;
		}
		if(returnTrue)
				return true;
			else
				return false;
	}
	*/

}