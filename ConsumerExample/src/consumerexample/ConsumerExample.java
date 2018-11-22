/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consumerexample;
import java.util.function.*;

/**
 *
 * @author socialclimber
 */
public class ConsumerExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Consumer<String> s1 = System.out::println;
        Consumer<Integer> s2 = a -> System.out.println(a);
        s1.accept("Wellcome to consumer");
        s2.accept(5);
    }
    
}
