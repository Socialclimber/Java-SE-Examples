/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication54;

/**
 *
 * @author socialclimber
 */
public class JavaApplication54 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String start = "AniMaL ";
        String trimmed = start.trim();
        String lowercase = trimmed.toLowerCase();
        String result = lowercase.replace('a', 'A');
        System.out.println(result);
    }
    
}
