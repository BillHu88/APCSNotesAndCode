public class DiplomaWithHonors extends Diploma{
   // private String statement;
   // private String nm;
   // private String dept;
    public DiplomaWithHonors(String name, String dpt){
        super(name,dpt);
    }
    public String toString(){
        statement = super.toString() + "\n***With Honors***";
        return statement;
    }
}