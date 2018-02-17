public class Diploma{
    public String nm;
    public String dept;
    public Diploma(String name, String dpt){
        nm = name;
        dept = dpt;
    }
    public String toString(){
        return ("This cetrifies that " + nm + " has completed a MOOC in " + dept);
    }
}