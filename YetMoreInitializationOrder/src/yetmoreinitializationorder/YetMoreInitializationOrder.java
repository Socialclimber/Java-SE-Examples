/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yetmoreinitializationorder;

/**
 *
 * @author socialclimber
 */
public class YetMoreInitializationOrder {
    static { add(2); }
static void add(int num) { System.out.print(num + " "); }

//YetMoreInitializationOrder() { add(5); }

static { add(4); }
{ add(6); }
//static { new YetMoreInitializationOrder(); }
{ add(8); }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
