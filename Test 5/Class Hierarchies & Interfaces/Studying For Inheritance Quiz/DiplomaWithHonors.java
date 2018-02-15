public class DiplomaWithHonors extends Diploma{ 
    public DiplomaWithHonors(String name, String dpt){
        super(name,dpt);
    }
    public String toString(){
        return super.toString() + "***With Honors*****";
    }
}