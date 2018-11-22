/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binaryoperatorexample;
import java.util.function.*;

/**
 *
 * @author socialclimber
 */
public class BinaryOperatorExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BinaryOperator<String> b2 = (string, toAdd) -> string.concat(toAdd);
        System.out.println(b2.apply("Hello", "World"));
    }
    
}
