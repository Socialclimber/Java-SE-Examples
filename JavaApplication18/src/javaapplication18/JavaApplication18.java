/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication18;
import java.util.HashMap;
import java.util.Map;
import java.util.function.*;

/**
 *
 * @author socialclimber
 */
public class JavaApplication18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Map<String, String> map = new HashMap<>();
        BiConsumer<String, String> b1 = map::put;
        BiConsumer<String, String> b2 = (k, v) -> map.put(k, v);
        b1.accept("Chicken", "Cluck");
        b2.accept("chick", "Tweep");
        System.out.print(map);
    }
    
}
