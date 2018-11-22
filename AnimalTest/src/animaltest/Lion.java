
package animaltest;

public class Lion extends Animal{
    public Lion(String n, int m, int s){
        this.setName(n);
        this.setSize(m);
        this.setAge(s);
    }
    public void speak(){
        System.out.println("A "+getAge()+" Years old Lion of size "+getSize()+" roars");
    }
}
