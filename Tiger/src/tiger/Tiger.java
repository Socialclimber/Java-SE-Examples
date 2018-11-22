/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiger;

/**
 *
 * @author socialclimber
 */
public class Tiger {
    String name;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tiger t1 = new Tiger();
        Tiger t2 = new Tiger();
        System.out.println(t1.equals(t2));
        String n = new String("Hello");
        String n1 = new String("Hello");
        System.out.println(n.equals(n1));
    }
    
}
