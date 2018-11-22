/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

/**
 *
 * @author socialclimber
 */
class HeavyAnimal { }
class Hippo extends HeavyAnimal { }
class Elephant extends HeavyAnimal { }
public class JavaApplication13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HeavyAnimal hippo = new Hippo();
        boolean b1 = hippo instanceof Hippo;
        boolean b2 = hippo instanceof HeavyAnimal;
        boolean b3 = hippo instanceof Elephant;
        System.out.println(b1);
        System.out.println(b2);
       System.out.println(b3);
    }
    
}
