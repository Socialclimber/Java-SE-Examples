
package problema001k;
import java.util.Scanner;
public class ProblemA001k {

    /**
     * @param args the command line arguments
     */
    // Let's write a function to sum values in arange from 1 to q given q and n
    public static void sumOfRange(int q, int n){
        int sum = 0;
        while(q <= n){
            if(n%q == 0 && q<=n){
                for(int i=0 ; i<q ; i++){
                    sum+=i;
                  }
                System.out.println("Sum from 1 to "+q +":"+sum);
            }
                q *=2;
        }
    }
    public static void main(String[] args) {
        // get the values from the user and supply to the function
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter values for q and n:");
        int q = input.nextInt();
        int n = input.nextInt();
        
        sumOfRange(q,n);
    }
    
}
