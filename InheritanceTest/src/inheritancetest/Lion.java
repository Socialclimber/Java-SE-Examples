/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancetest;

/**
 *
 * @author socialclimber
 */
public class Lion extends Animal{

    /**
     * @param args the command line arguments
     */
    private void roar() {
        System.out.println(name+" The "+getAge()+" year old lion says: Roar!");
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        new Lion().roar();
    }
    
}
