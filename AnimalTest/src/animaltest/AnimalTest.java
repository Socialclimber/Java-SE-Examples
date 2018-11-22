
package animaltest;

public class AnimalTest {
    public static void main(String[] args){
        Lion l = new Lion("Lion",10,8);
        Cat c = new Cat("Cat", 23, 6);
        Dog g = new Dog("Dog", 23, 54);
        l.speak();
        c.speak();
        g.speak();
    }
}
