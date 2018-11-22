
package lambda3;
import java.util.Scanner;
import java.util.function.Predicate;

public class Lambda3 {

    public static void main(String[] args) {
        System.out.println("Please enter your gmail address:");
        Scanner input = new Scanner(System.in);
        boolean t = true;
        while(t){
            String email = input.next();
            check(email,a->a.contains("@gmail.com"));
        }
      
    }
   static void check(String n, Predicate<String> m){
        if( m.test(n)){
            System.out.print(n+" Is a valid Email");
        }
    }
    
}
