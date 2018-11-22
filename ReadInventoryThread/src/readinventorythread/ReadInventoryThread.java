/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readinventorythread;

/**
 *
 * @author socialclimber
 */
public class ReadInventoryThread extends Thread{
    public void run(){
        System.out.println("Printing zoo inventory:");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        (new ReadInventoryThread()).start();
    }
    
}
