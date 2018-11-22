
package lemur;
class Primate {
    public boolean hasHair() {
     return true;
    }
}
interface HasTail {
    public boolean isTailStriped();
}
public class Lemur  extends Primate implements HasTail{
    public boolean isTailStriped() {
        return false;
    }
    public int age = 10;
    public static void main(String[] args) {
        Lemur lemur = new Lemur();
        System.out.println(lemur.age);
         System.out.println(lemur.hasHair());
          System.out.println(lemur.isTailStriped());
        HasTail hasTail = lemur;
        System.out.println(hasTail.isTailStriped());
        Primate primate = lemur;
        System.out.println(primate.hasHair());
    }
    
}
