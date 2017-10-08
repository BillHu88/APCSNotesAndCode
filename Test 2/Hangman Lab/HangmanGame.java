public class HangmanGame{
  private String word;
  private StringBuffer triedLets = new StringBuffer();
  private StringBuffer soFar = new StringBuffer();
  public HangmanGame(String w){
    word = w.toUpperCase();
    for(int i = 0; i<word.length(); i++){
      soFar.append('-');
    }
  }

  public static void main(String[] args){

  }
  public String getWord(){
    return word;
  }
  public String getGuessed(){
    return soFar.toString();
  }
  public String getTried(){
    return triedLets.toString();
  }
  public int tryLetter(char letter){
    char let = Character.toUpperCase(letter);
    if((triedLets.toString()).indexOf(let)==-1){ //if this letter hasn't been tried
      triedLets.append(let);
      if(word.indexOf(let)==-1){ //if the guessed letter is not in the word
        return -1;
      }
      else{//if guessed letter in word
        for(int i = 0; i<word.length(); i++){
          if(word.charAt(i)==Character.toUpperCase(letter)){
            soFar.setCharAt(i, letter);
          }
        }
        return 1;
      }
    }
    else{
      return 0;
    }

  }
}
