
package greeetings;
import java.util.Scanner;
public class Greeetings {

    public static void main(String[] args) {
        User u = new User();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
       
        //u.setName(input.next());
        u.name = input.next();
        System.out.println("Welcome to java Mr. "+ u.getName());
        
    }
    
}

class User{
    private String name;
    public String getName() {
        return name;
    }

    /*public void setName(String name) {
        this.name = name;
    }*/
    
}