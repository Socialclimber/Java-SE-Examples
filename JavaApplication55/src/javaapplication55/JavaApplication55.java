/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication55;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author socialclimber
 */
public class JavaApplication55 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
List<Integer> java = new ArrayList<>();
List<Integer> list = Arrays.asList(10, 4, -1, 5);
Collections.sort(list);
Integer array[] = list.toArray(new Integer[4]);
System.out.println(array[0]);
char[]c = new char[2];
java.add(99);
java.add(5);
java.add(81);
Collections.sort(java);
System.out.println(java);
    }
    
}
