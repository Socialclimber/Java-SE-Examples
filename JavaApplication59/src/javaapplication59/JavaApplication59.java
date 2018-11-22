/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication59;
import java.util.Scanner;

/**
 *
 * @author socialclimber
 */
public class JavaApplication59 {
    void add(int a, int b){
       System.out.println("int"+(a+b));
    }
    void add(double a, double b){
        System.out.print(a+b);
    }
    void add(float a, float b){
        System.out.println(a+b);
    }
    void add(float a, int b){
        System.out.print(a+b);
    }
     void add(double a, int b){
        System.out.print(a+b);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JavaApplication59 t = new JavaApplication59();
       t.add(10.2, 0.23);
       t.add(10, 0);
    
    }
    
}
