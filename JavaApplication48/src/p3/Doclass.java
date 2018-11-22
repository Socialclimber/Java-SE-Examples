/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3;
import p1.DoInterface;

/**
 *
 * @author socialclimber
 */
public class Doclass  implements DoInterface{
    int x1, x2;
   public Doclass(){
        this.x1 = 0;
        this.x2 = 10;
    }
    public void m1(int p1){x1+=p1; System.out.println(x1);}
    public void m2(int p1){x2+=p1; System.out.println(x2);}
}
