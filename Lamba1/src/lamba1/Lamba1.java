
package lamba1;
import java.util.function.*;

interface Fn{
    void test();
}
public class Lamba1 {

    public static void main(String[] args) {
        
        /******************************************************
         * Declare a variable of type Fn and assign you lambda *
         * expression to it.                                   *
         * *****************************************************/
    Fn a = ()-> System.out.println("Hello World");
    
    // calling the method of Fn will automatically call the lambda expressio
        a.test();
    }
}
