
package animaltest;

public class Dog extends Animal{
     public Dog(String n, int m, int s){
        this.setName(n);
        this.setSize(m);
        this.setAge(s);
    }
    public void speak(){
        System.out.println("A "+getAge()+" Years old Dog of size"+getSize()+" barks");
    }
}
