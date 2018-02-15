public class Limerick extends Poem{
    public int numLines(){
        return 5;
    }
    public int getSyllables(int k){
        if(k==1||k==2||k==5)
            return 9;
        else
            return 6;
    }
}