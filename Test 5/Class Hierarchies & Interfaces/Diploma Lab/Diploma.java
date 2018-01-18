public class Diploma{
   public String statement;
   private String nm;
   private String dept;
   
    public Diploma(String name, String dpt){
      nm = name;
      dept = dpt;
    }
    public String toString(){
        statement = "This certifies that " + nm + " has completed a MOOC in " + dept;
        return statement;
    }
}