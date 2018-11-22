/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamexample;
import java.util.stream.*;

/**
 *
 * @author socialclimber
 */
public class StreamExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Stream<String> s1 = Stream.empty();
        Stream<Integer> i1 = Stream.of(1);
        Stream<Integer> arr = Stream.of(1, 2, 3);
       System.out.println(arr.count());
    }
    
}
