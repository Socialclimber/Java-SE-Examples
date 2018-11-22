/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package initializationorder;

/**
 *
 * @author socialclimber
 */
public class InitializationOrder {

private String name = "Torchie";

{ System.out.println(name); }

private static int COUNT = 0;

static { System.out.println(COUNT); }

{ COUNT++; System.out.println(COUNT); }

public InitializationOrder() {

System.out.println("constructor");

}
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("read to construct");
        System.out.println("read to construct second time");
        
        new InitializationOrder();
        System.out.println("Hello");
    }
    
}

