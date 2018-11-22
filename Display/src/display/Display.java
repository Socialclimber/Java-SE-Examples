
package display;
import java.util.Scanner;

public class Display {
    static final float totalMark = 70;
    
    static void grade(float mark){
       float results = ((mark/totalMark)*100);
       if(results >= 80){
           System.out.println(results+"% is an A");
       }else if(results < 30){
            System.out.println(results+"% is the mark of a Job!");
       }else if(results >= 75 && results<=79){
         System.out.println(results+"% is an B+");
        }else if(results >= 70 && results <75){
             System.out.println(results+"% is an B");
        }else if(results >= 65 && results<70){
             System.out.println(results+"% is an C+");
        }else if(results >=50 && results < 64){
             System.out.println(results+"% is an C");
        }else if(results < 50 && results > 40){
             System.out.println(results+"% is a mark for a failure");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter your mark: ");
        float f = input.nextFloat();
        grade(f);
         
                }
    
}
