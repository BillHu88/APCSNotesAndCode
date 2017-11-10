import java.util.*;
public class LineList{
    private ArrayList<String> entry;
    public LineList(){
        entry = new ArrayList<String>();
    }
    public int size(){
        return entry.size();
    }
    public String get(int k){
        return entry.get(k);
    }
    public void add(String line){
        entry.add(line);
    }
    public String remove(int k){
        String temp = entry.get(k);
        entry.remove(k);
        return temp;
    }
    public void move(int index, int newIndex){
        String temp = entry.remove(index);
        entry.add(newIndex, temp);
    }
    public void shuffle(){
        int n = entry.size()-1; 
        while(n>=2){
            int randVal = (int)(Math.random() * n);
            move(randVal, n);
            n--;
        }  
    }
}