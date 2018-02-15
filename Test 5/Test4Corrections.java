public class Test4Corrections{

    private static int[][] hwy;

    public static void main(String[] args){

        hwy = new int[4][8];
        addCar(0,1 );
        addCar(0, 6);
        addCar(1, 3);
        addCar(1, 6);
        addCar(2,1);
        addCar(2, 4);
        addCar(3, 2);
        addCar(3, 3);
        addCar(3,4);
        for(int[] lane: hwy){
            for(int l: lane){
                System.out.print(l);
            }
            System.out.println();
        }
        System.out.println();
        moveAllForward();
        System.out.println();
        System.out.println();
        for(int[] lane: hwy){
            for(int l: lane){
                System.out.print(l);
            }
            System.out.println();
        }

    }



    public static void addCar(int lane, int x){
        hwy[lane][x]=1;
    }

    public static void moveAllForwardScreen(){
        int lanes = hwy.length;
        int xMax = hwy[0].length-1;
        int saved = 0;
        for (int lane = 0; lane<lanes; lane++){
            saved = hwy[lane][xMax];
            for(int x = xMax; x>0;x--){
                hwy[lane][x]=hwy[lane][x-1];
            }
            hwy[lane][0] = saved;
        }
    }

    public static void moveAllForward(){
        for(int r = 0; r<hwy.length;r++){
            for(int c=0;c<hwy[0].length;c++){
                //System.out.print(hwy[r][c] + "\t");
                //System.out.print(r);
                //System.out.println(c);
                if(c==hwy.length-1&&hwy[r][c]==1){
                    //System.out.println("on the last one");
                    hwy[r][c]=0;
                    hwy[r][0]=1;
                    c++;
                }
                else if(hwy[r][c]==1){
                    hwy[r][c]=0;
                    hwy[r][c+1]=1;
                    c++;
                }
                else{
                    continue;
                }
            } //end inner
            //System.out.println();
        } //end outer
    } //end method

    public static void printRow(int[] row) {
        for (int i : row) {
            System.out.print(i);
            System.out.print("\t");
        }
        System.out.println();
    }

    public static void printArray(int[][] tbl){
        for(int[] row : tbl) {
            printRow(row);
        }
    }

}