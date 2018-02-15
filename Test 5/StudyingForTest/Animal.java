
/**
 * Write a description of class Animal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Animal
{
    // instance variables - replace the example below with your own
    private String name = "Animal";
    public String favFood = "Food";
    
    protected final void changeNmae(String newName){
     this.name = newName;
    }
    
    protected final String getName(){
     return this.name;
    }
    
    public void eatStuff(){
     System.out.println("Yum" + favFood);   
    }
    
    public void walkAround(){
     System.out.println(this.name + " walks around");
    }
    
    public Animal(String name, String favFood){
     this.name = name;
     this.favFood = favFood;
    }
}
