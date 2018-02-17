public class OneDimensionalPractice{
    public static void main(String[] args){
        //int[] test = {1,1,1,1,2};
        //System.out.println(sameCheck(test));
        //System.out.println(getRandomRps());
        //System.out.println(computeScore("HELLO"));
    }
    public static boolean sameCheck(int[] scores){
        boolean allSame=false;
        if(scores[0]==scores[scores.length-1])
            allSame=true;
        return allSame;
    }
    public static char getRandomRps(){
        char[] randomArray = {'r','r','r','p','p','p','p','p','s','s','s','s','s','s'};
        int randomPick = (int) Math.floor(Math.random() * randomArray.length);
        return randomArray[randomPick];
    }
    public static int computeScore(String word){
        int score = 0;
        int[] pointVals = {1,2,3,1,4,2,4,1,8,5,1,3,1,1,3,10,1,1,1,1,4,4,8,4,10};
        char[] letters = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        for(int i = 0; i<word.length(); i++){
            char temp = word.charAt(i);
            int tempIndex = 0;
            for(int j = 0; j<letters.length; j++){
                if(letters[j]==temp){
                    tempIndex=j;
                    break;
                }
                else{
                    continue;
                }
            }
            score+=pointVals[tempIndex];
        }
        return score;
    }
}