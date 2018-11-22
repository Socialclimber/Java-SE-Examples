/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkresults;

/**
 *
 * @author socialclimber
 */
public class CheckResults {
private static int counter = 0;
public static void main(String[] args) throws InterruptedException{
new Thread(() -> {
for(int i=0; i<5000; i++) CheckResults.counter++;
}).start();
while(CheckResults.counter<100) {
System.out.println("Not reached yet");
Thread.sleep(1000); // 1 SECOND
}
System.out.println("Reached!");
}
}
