/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author socialclimber
 */
class Sparrow extends Bird { }
 class Bird { }
public class Test1 {

    /**
     * @param args the command line arguments
     */
    static private void groupOfFlyers(List<? extends Bird> flyer) {}
    public static void main(String[] args) {
        // TODO code application logic here
        List< Bird> birds = new ArrayList<>();
        List<Sparrow> sp = new ArrayList<>();
        //birds.add(new Sparrow());// DOES NOT COMPILE
       // List<? extends Bird> add = birds.add((new Bird));
       groupOfFlyers(birds);
       groupOfFlyers(sp);
       List<? super IOException> exceptions = new ArrayList<Exception>();
      // exceptions.add(new Exception());
      exceptions.add(new IOException());
      exceptions.add(new FileNotFoundException());
    }
    
}
