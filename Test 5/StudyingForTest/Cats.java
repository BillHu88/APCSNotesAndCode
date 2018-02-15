
/**
 * Write a description of class Cats here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cats extends Animal
{
    public String favToy = "Yarn";
    public void playWith(){
     System.out.println("Yeah " + favToy);   
    }
    
    public void walkAround(){
     System.out.println(this.getName() + " stalks around");   
    }
    
    public Cats(String name, String favFood, String favToy){
     super(name, favFood);
     this.favToy=favToy;
    }
}
