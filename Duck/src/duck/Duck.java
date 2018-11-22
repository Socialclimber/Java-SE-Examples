/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author socialclimber
 */
public class Duck {

    /**
     * @param args the command line arguments
     */
    private String name;
    public Duck(String name) {
    this.name = name;
    }
    public String toString() {
        // use readable output
        return name;
    }
    public int compareTo(Duck d) {
        return name.compareTo(d.name);
        // call String's compareTo
    }
    public static void main(String[] args) {
        List<Duck> ducks = new ArrayList<>();
        ducks.add(new Duck("Quack"));
        ducks.add(new Duck("Puddles"));
        //Collections.sort(ducks);
        // sort by name
        System.out.println(ducks);
        // [Puddles, Quack]
    } 
}
 
    

