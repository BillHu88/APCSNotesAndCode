public abstract class Poem{
    public abstract int numLines();
    public abstract int getSyllables(int k);
    public void printRhythm(){
        for(int i = 1; i<=numLines(); i++){
            for(int j = 0; j<getSyllables(i); j++){
                if(j==getSyllables(i)-1)
                    System.out.print("ta");
                else System.out.print("ta-");
            }
            System.out.println();
        }
    }
}