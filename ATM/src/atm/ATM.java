
package atm;
import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {
        User u = new User();
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter your name: ");
        u.setName(input.next());
        System.out.println("Please, enter your balance: ");
        u.setBalance(input.nextDouble());
        System.out.println(" your name is : "+ u.getName());
        System.out.println(" your Balance is: "+u.getBalance());
        
        
    }
    
}
 class User{
     // declare fields
     private String name;
     private double balance;

       // implement getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
     
 }
