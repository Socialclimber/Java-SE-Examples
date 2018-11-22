/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2;

/**
 *
 * @author socialclimber
 */
public class Test2 {
    /*int x, y;
    public Test2(int x, int y){
        initialize(x,y);
    }
    public void initialize(int x, int y){
        this.x = x*x;
        this.y = y;
    }*/

    /**
     * @param args the command line arguments
     */
    static boolean isAvail = false;
      public static boolean doStuffs(){
           return isAvail;
        }
    public static void main(String[] args) {
        String str1 = "Java";
        String []str2 = {"J","a","v","a"};
        String str3 = "";
        for(String str : str2){
            str3 = str3 + str;
        }
        boolean b1 = (str1 == str3);
        boolean b2 = (str1.equals(str3));
        System.out.print(b1+""+b2);
        
        // TODO code application logic here
       // int x = 3; int y = 5;
        //Test2 obj = new Test2(x,y);
        //System.out.println(x+" "+y);
       
        Test2 ts = new Test2();
        System.out.print(isAvail);
        isAvail = ts.doStuffs();
        System.out.print(isAvail);
      
         
        
    }
    
}
