/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supplierexample;
import java.time.LocalDate;
import java.util.function.*;
import java.util.*;

/**
 *
 * @author socialclimber
 */
public class SupplierExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Supplier<LocalDate> s1 = LocalDate::now;
        Supplier<LocalDate> s2 = ()->LocalDate.now();
        System.out.println(s1.get());
        System.out.println(s2.get());
    }
    
}
