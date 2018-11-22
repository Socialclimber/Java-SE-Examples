

package predicatesearch;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
public class PredicateSearch {
    
   public void methodA() { 
        
       return;}
    public static void main(String[] args) {
       List<Animal> animals = new ArrayList<Animal>();

        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("Kangaro", true, false));
        print(animals, a -> a.canHop());
        print(animals, a->a.canSwim());
    }
    private static void print(List<Animal> animals, Predicate<Animal> checker) {

        for (Animal animal : animals) {

        if (checker.test(animal))

        System.out.print(animal + " ");

     }

            System.out.println();
 }
}
class Animal {
private String species;
private boolean canHop;
private boolean canSwim;
public Animal(String speciesName, boolean hopper, boolean swimmer) {
species = speciesName;
canHop = hopper;
canSwim = swimmer;
}
public boolean canHop() { return canHop; }
public boolean canSwim() { return canSwim; }
public String toString() { return species; }
}


