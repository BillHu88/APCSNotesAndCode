import java.util.ArrayList;
import java.util.Arrays;
public class TestCorr2{
    public static ArrayList<String> cityNames;
    public static int[][] distances;
    public static boolean[] visits;
    public static void main(String[] args){
        String[] cityNames = new String[4];      
        cityNames[0]=("New York");
        cityNames[1]=("Los Angeles");
        cityNames[2]=("Paris");
        cityNames[3]=("London");
        boolean[] visits = new boolean[4];
        visits[0]=false;
        visits[1]=true;
        visits[2]=true;
        visits[3]=true;
        System.out.println(Arrays.toString(visits));
        distances = new int[4][4];
        distances[0][1]=2789;
        distances[1][0]=2789;
        distances[0][2]=3625;
        distances[2][0]=3625;
        distances[3][0]=3459;
        distances[0][3]=3459;
        distances[1][2]=5642;
        distances[2][1]=5642;
        distances[1][3]=53437;
        distances[3][1]=5437;
        distances[2][3]=291;
        distances[3][2]=291;
        System.out.println(cityNames.toString());
        for(int r = 0; r<distances.length; r++){
            for(int c = 0; c<distances[0].length; c++){
                System.out.print(distances[r][c] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("closest to "+cityNames[2] + " is " + anotherShot(2,visits) + ", or "+cityNames[anotherShot(2,visits)]);
    }
   

    public static int anotherShot(int i, boolean[] visited){
        int min=1000000000; //The circumference of Earth at the equator is about 24,902 miles, so the starting min has to be
        //larger than the distance between any two of the cities in the array
        int mindex=0;
        for(int j=0; j<distances.length;j++){
            if(visited[j]!=true&&distances[i][j]<min&&j!=i){
                min=distances[i][j];
                mindex = j;
            }
        }
        return mindex;
    }

    public static int findNearestCity(int i, boolean[] visited){
        int counter = 0;
        for(int k =0; k<visited.length;k++){
            if(visited[k]==false)
                counter++;
        }
        //System.out.println("Counter:"+counter);
        int[] dists = new int[counter];
        int fillCount=0;
        for(int j = 0; j<distances.length; j++){
            if(visited[j]==false){
                dists[fillCount]=distances[i][j];
                // System.out.println(dists[fillCount]);
                fillCount++;
            }
            if(fillCount==dists.length-1){
                break;
            }
        }
        //System.out.println(dists[0]+dists[1]);
        for(int r = 0; r<dists.length-1; r++){
            int position = i;
            for(int g=r+1; g<dists.length;g++){
                if(dists[g]<dists[position])
                    position=g;
            }
            int temp = dists[r];
            dists[r]=dists[position];
            dists[position]=temp;
        }
        int target = dists[dists.length-1];
        int index = -1;

        for (int yeet = 0; (yeet < distances[0].length) && (index == -1); yeet++) {
            if (distances[i][yeet] == target) {
                index = i;
            }
        }
        return index;   
    }
}