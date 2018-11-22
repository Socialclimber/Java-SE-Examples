
package animaltest;


public class Cat extends Animal{
     public Cat(String n, int m, int s){
        this.setName(n);
        this.setSize(m);
        this.setAge(s);
    }
    public void speak(){
        System.out.println("A "+getAge()+" Years old cat of size "+getSize()+" meows");
    }
    
}
