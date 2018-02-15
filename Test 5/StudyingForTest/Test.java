public class Test{
 public static void main(String[] args){
  Animal genericAnimal = new Animal("name", "food");
  System.out.println(genericAnimal.getName());
  System.out.println(genericAnimal.favFood);
  
  Cats morris = new Cats("Morris", "Tuna", "Rubber Mouse");
  
  System.out.println();
  
  System.out.println(morris.getName());
  System.out.println(morris.favFood);
  System.out.println(morris.favToy);
 }
}