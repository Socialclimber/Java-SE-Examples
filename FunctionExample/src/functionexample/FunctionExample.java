/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functionexample;
import java.util.function.*;

/**
 *
 * @author socialclimber
 */
public class FunctionExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Function<String, Integer> f1 = String::length;
        Function<String, Integer> f2 = s -> s.length();
        System.out.println(f1.apply("Hello"));
        System.out.println(f2.apply("Hello"));
        
    }
    
}
