/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkresults1;

import java.util.concurrent.*;
public class CheckResults1 {
private static int counter = 0;
public static void main(String[] args) throws InterruptedException,
ExecutionException {
ExecutorService service = null;
try {
service = Executors.newSingleThreadExecutor();
Future<?> result = service.submit(() -> {
for(int i=0; i<500; i++) CheckResults1.counter++;
});
result.get(10, TimeUnit.SECONDS);
System.out.println("Reached!");
} catch (TimeoutException e) {
System.out.println("Not reached in time");
} finally {
if(service != null) service.shutdown();
}
}
}