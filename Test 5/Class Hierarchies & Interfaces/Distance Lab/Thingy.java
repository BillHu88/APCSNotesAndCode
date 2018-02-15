public class Thingy implements Place{
    private int x;
    public Thingy(int xVal){
        this.x = xVal;
    }
    public int distance(Place other){
        return Math.abs(x-other.getX());
    }
    public int getX(){
        return x;
    }
}