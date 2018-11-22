/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication53;

/**
 *
 * @author socialclimber
 * 
 */
class NoMoreCarrotsException extends Exception{}
public class JavaApplication53 {
 public static void main(String[] args) {

System.out.print("a");

try {

System.out.print("b");

throw new IllegalArgumentException();

} catch (IllegalArgumentException e) {

System.out.print("c");

throw new IllegalArgumentException("1");

} finally {

System.out.print("e");

throw new RuntimeException("3");

}
 }       
    
}
