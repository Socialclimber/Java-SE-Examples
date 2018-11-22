/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooinfo;
import java.util.concurrent.*;

/**
 *
 * @author socialclimber
 */
public class ZooInfo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ExecutorService service = null;
        try {
                service = Executors.newSingleThreadExecutor();
                System.out.println("begin");
                service.execute(() -> System.out.println("Printing zoo inventory"));
                service.execute(() -> {for(int i=0; i<3; i++)
                System.out.println("Printing record: "+i);}
                );
                service.execute(() -> System.out.println("Printing zoo inventory"));
                System.out.println("end");
        } finally {
                if(service != null) service.shutdown();
        }
    }
    
}
