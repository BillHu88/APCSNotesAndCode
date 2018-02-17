public class Test{
    public static void main(String[] args){
        Place p1 = new Thingy(10);
        Place p2 = new Thingy(0);
        Place p3 = new Thingy(20);
        System.out.println(sameDistance(p1,p2,p3));
    }
    public static boolean sameDistance(Place p1, Place p2, Place p3){
        return p1.distance(p2)==p1.distance(p3);
    }
}