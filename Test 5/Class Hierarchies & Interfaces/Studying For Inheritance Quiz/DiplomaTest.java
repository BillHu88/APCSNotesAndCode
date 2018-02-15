public class DiplomaTest{
    public static void main(String[] args){
        Diploma diploma1 = new Diploma("Adam Smith", "English");

        System.out.println(diploma1);

        System.out.println();

        

        Diploma diploma2 = new DiplomaWithHonors("Geraldine Corey", "Robotics");

        System.out.println(diploma2);

        System.out.println();
    }
}