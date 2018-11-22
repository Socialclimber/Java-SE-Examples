
package lambda2;
import java.util.Scanner;
interface Fn2{
    void test1(String n);
}
public class Lambda2 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
      Fn2 b =  (String n)-> System.out.println(n);
      b.test1("Hello World");
    }
    
}
