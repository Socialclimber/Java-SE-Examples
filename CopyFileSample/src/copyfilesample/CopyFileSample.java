
package copyfilesample;
import java.util.Scanner;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;


public class CopyFileSample {
    static char answer;
    static  int i = 0;
    public static void main(String[] args) {
       File f = new File("newfileanswers");
       Scanner input = new Scanner(System.in);
       try{
       OutputStream out = new FileOutputStream(f);
       while(i < 5){
           System.out.println("Please, enter answer for question "+i+": ");
           answer = input.next().charAt(0);
           out.write(i);
           out.flush();
           i++;
       }
       }catch(IOException e){
           System.out.println(e);
       }
    }
    
}
