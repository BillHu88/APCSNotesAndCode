import java.util.ArrayList;
import java.lang.StringBuffer;
public class IndexEntry {
    private String word;
    private ArrayList<Integer> numList;
    
    public IndexEntry(String takenWord){
        this.word = takenWord.toUpperCase();
        numList = new ArrayList<Integer>();
    }
    public void add(int num){
        if(numList.contains(num)){

        }
        else{
            numList.add(num);
        }
    }
    public String getWord(){
        return word;
    }
    public String toString(){
      StringBuffer myString = new StringBuffer();
      myString.append(word);
      myString.append(" ");
      for(int i = 0; i<numList.size(); i++){
          if(i == (numList.size()-1)){
              myString.append(numList.get(i));
          }
          else{
              myString.append(numList.get(i));
              myString.append(", ");
          }
      }
      return myString.toString();
    }

}