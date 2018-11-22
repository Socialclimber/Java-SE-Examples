/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readfileinformation;
import java.io.File;

/**
 *
 * @author socialclimber
 */
public class ReadFileInformation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File file = new File("C:\\data\\zoo.txt");
        System.out.println("File exist: "+ file.exists());
        if(file.exists()){
            System.out.println("File Absolute Path: "+file.getAbsolutePath());
            System.out.println("Is Directiory: "+file.isAbsolute());
            System.out.println("Parent path: "+file.getParent());
            if(file.isFile()){
                System.out.println("File size: "+file.length());
                System.out.println("Last modiofied: "+file.lastModified());
            }else{
                for(File subfile : file.listFiles()){
                    System.out.println("\t"+subfile.getName());
                }
            }
        }
        
        
    }
    
}
