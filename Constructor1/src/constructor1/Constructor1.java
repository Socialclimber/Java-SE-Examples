/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor1;
public class Constructor1 {
    String name;
    // first constructor
    public Constructor1(){
        System.out.println("First Constructor");
    }
    
    // Second constructor
    public Constructor1(int n){
        this();
        System.out.println(n);
    }
    public Constructor1(int a , int b){
        this();
        this.name = "";
    }    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Constructor1 h1 = new Constructor1(10);
    }
    
}
