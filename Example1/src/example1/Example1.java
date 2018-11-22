/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example1;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.function.UnaryOperator;

/**
 *
 * @author socialclimber
 */
class Caller implements Callable<String> {
String str;
public Caller (String s) {this.str=s;}
@Override
public String call()throws Exception { return str.concat ("Caller");}
}
class Runner implements Runnable {
String str;
public Runner (String s) {this.str=s;}
public void run () { System.out.println (str.concat ("Runner"));};
}
public class Example1{
    public static void main(String[] args) throws InterruptedException, ExecutionException{
        ExecutorService es = Executors.newFixedThreadPool(2);
        Future f1 = es.submit (new Caller ("Call"));
        Future f2 = es.submit (new Runner ("Run"));
        String str1 = (String) f1.get();
        String str2 = (String) f2.get();//line n1
        System.out.println(str1+ ":" + str2);
        
}
}