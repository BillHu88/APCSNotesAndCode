import java.util.ArrayList;
public class study{
    public static void main(String[] args){
        /*
        ArrayList<Integer> test = new ArrayList<Integer>();
        test.add(1);
        test.add(3);
        test.add(6);
        test.add(7);
        test.add(1);
        test.add(2);
        test.add(9);
        test.add(2);
        */
        /*
        ArrayList<String> test = new ArrayList<String>();
        test.add("four");
        test.add("score");
        test.add("and");
        test.add("seven");
        test.add("years");
        test.add("ago");
        switchPairs(test);
        */
        ArrayList<String> test = new ArrayList<String>();
        test.add("this");
        test.add("is");
        test.add("lots");
        test.add("of");
        test.add("fun");
        test.add("for");
        test.add("every");
        test.add("Java");
        test.add("programmer");
        markLength4(test);
    }

    public static void removeBadPairs(ArrayList<Integer> array){
        for(int i = 0; i<array.size()-1; i++){
            System.out.println("bad pair" + array.get(i) + array.get(i+1));
            if(array.get(i)>array.get(i+1)){
                array.remove(i);
                array.remove(i);
            }
            else{
                System.out.println("good pair" + array.get(i) + array.get(i+1));
                continue;
            }
        }
    }
    public static void switchPairs(ArrayList<String> array){
        System.out.println(array.toString());
        for(int i = 0; i<array.size()-1; i=i+2){
            String temp = array.get(i);
            array.remove(i);
            array.add(i+1,temp);
        }
        System.out.println(array.toString());
    }
    public static void markLength4(ArrayList<String> array){
        System.out.println(array.toString());
        for(int i = 0; i<array.size(); i++){
            if(array.get(i).length()==4){
                array.add(i, "****");
                i++;
            }
        }
        System.out.println(array.toString());
    }
}