/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtualmethods;

/**
 *
 * @author socialclimber
 */
abstract class Animal {
    public abstract void feed(); 
}

class Cow extends Animal {
    public void feed() { addHay(); }
    private void addHay() { System.out.println("Feeding a Cow with Hay!"); }
}
class Bird extends Animal {
    public void feed() { addSeed(); }
    private void addSeed() { System.out.println("Feeding a Bird with Seed"); }
}

class Lion extends Animal {
    public void feed() { addMeat(); }
    private void addMeat() { System.out.println("Feeding a Lion with meat"); }
}
 class Hippo{}

public class Virtualmethods {

    /**
     * @param args the command line arguments
     */
    public static void feedAnimal(Animal a){
          a.feed();
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Animal a = new Cow();
        a.feed();
        System.out.println(a instanceof Cow);
        Animal b = new Lion();
        b.feed();
        System.out.println(b instanceof Lion);
        Animal c = new Bird();
        c.feed();
        System.out.println(c instanceof Bird);
        feedAnimal(a);
    }
    
}
