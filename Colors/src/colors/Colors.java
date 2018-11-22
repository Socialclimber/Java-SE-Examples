/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colors;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

/**
 *
 * @author socialclimber
 */
public class Colors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<String> colors = Arrays.asList("red", "green", "yellow");
        Predicate<String> test = n -> { System.out.println("Searching...");
            return n.contains("red");};
            
            colors.stream()
            .filter(c -> c.length() > 3)
            .anyMatch(test);
                   // .forEach(System.out::println);
    }
    
}
