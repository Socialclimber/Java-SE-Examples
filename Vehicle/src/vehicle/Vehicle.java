/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle;

import java.util.Set;
import java.util.TreeSet;

class Vehicle implements Comparable{
int vno;
String name;
public Vehicle (int vno, String name) {
this.vno = vno;
this.name = name;
}

@Override
public String toString () {
return vno + ":" + name;
}
public static void main(String[] args){
    Set<Vehicle> vehicles = new TreeSet <> ();
    vehicles.add(new Vehicle (10123, "Ford"));
    vehicles.add(new Vehicle (10124, "BMW"));
    System.out.println(vehicles);
}

@Override
    public int compareTo(Object o) {
        Vehicle v = (Vehicle)o;
        return name.compareTo(v.name); //To change body of generated methods, choose Tools | Templates.
    }
}


