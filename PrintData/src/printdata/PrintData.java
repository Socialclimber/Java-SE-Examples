/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printdata;

/**
 *
 * @author socialclimber
 */
public class PrintData implements Runnable{
       @Override
       public void run(){
           for(int i = 0 ; i < 3 ; i++){
               System.out.println("Printing record: "+i);
           }
       }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        (new Thread(new PrintData())).start();
    }
    
}
