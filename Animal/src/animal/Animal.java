/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;
import java.util.ArrayList;

/**
 *
 * @author socialclimber
 */
abstract class Animal1{
   // String name = "????";
    //public abstract void printName();
     public void printName(String name) {
        System.out.println(name);
    }
}

class Lion extends Animal1{
    String name = "Bobo Lion";
   
}
public class Animal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lion l = new Lion();
        l.printName(l.name);
        //System.out.println(new ArrayList(2).add(l));
        
    }
    
}
