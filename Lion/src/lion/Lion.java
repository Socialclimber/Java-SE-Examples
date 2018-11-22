/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lion;
class Animal{

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    private int age;
}
public class Lion extends Animal{

   private void roar() {
System.out.println("The "+getAge()+" year old lion says: Roar!");
}
    public static void main(String[] args) {
       new Lion().roar();
    }
    
}
