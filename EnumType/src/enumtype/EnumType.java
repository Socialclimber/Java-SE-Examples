/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumtype;

/**
 *
 * @author socialclimber
 */
enum Season{
    WINTER, SPRING, SUMMER, FALL;
}
public class EnumType {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Season s = Season.SUMMER;
        for(Season season : Season.values()){
            System.out.println(season.name()+" "+season.ordinal());
            //System.out.print(Season.name());
           
                }
                    Season summer = Season.SUMMER;
                switch (summer) {
                    case WINTER:
                    System.out.println("Get out the sled!");
                    break;
                    case SUMMER:
                    System.out.println("Time for the pool!");
                    break;
                    default:
                    System.out.println("Is it summer yet?");
                    }
        
        }
        
    }
    
