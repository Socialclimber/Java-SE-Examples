/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bipredicateexample;
import java.util.function.*;

/**
 *
 * @author socialclimber
 */
public class BiPredicateExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BiPredicate<String, String> b1 = String::startsWith;
        BiPredicate<String, String> b2 = (a,b) -> a.startsWith(b);
        System.out.println( b1.test("chicken", "chick"));
        System.out.println(b2.test("HelloWorld", "Hello"));
    }
    
}
