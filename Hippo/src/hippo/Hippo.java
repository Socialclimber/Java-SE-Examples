/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hippo;
import org.apache.commons.lang3.*;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *
 * @author socialclimber
 */
public class Hippo {
    private String name;
    private double weight;
    
    public Hippo(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }
   @Override
    public String toString() {
        //return name;
        return ToStringBuilder.reflectionToString(this,ToStringStyle.SHORT_PREFIX_STYLE);
    }
    public static void main(String[] args) {
        Hippo h1 = new Hippo("Harry", 3100);
        // Harry
        System.out.println(h1);
    } 
    
}
