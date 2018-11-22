package addition;
import java.util.Scanner;

public class Addition {
    static int add(int a, int b){
        //return a+b;
        int c = a+b;
        return c;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first value: ");
        int input1 = input.nextInt();
        System.out.println("Please enter second value: ");
        int input2 = input.nextInt();
        
        int results = add(input1, input2);
        System.out.println("The results is: "+results);
        
    }
    
}
