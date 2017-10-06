public class HangmanGame{
  private static String word;
  private static StringBuffer soFar = new StringBuffer(Hangman.word);
  private static StringBuffer triedLets = new StringBuffer();
  public HangmanGame(){
    for(int i = 0; i<word.length(); i++){
      soFar.insert(i, '-');
    }
  }
  public static void main(String[] args){
    System.out.println(soFar.toString());
  }

}
