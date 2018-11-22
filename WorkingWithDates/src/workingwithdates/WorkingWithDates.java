/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workingwithdates;
import java.time.*;
import java.util.Locale;

/**
 *
 * @author socialclimber
 */
public class WorkingWithDates {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ZoneId zone = ZoneId.of("US/Eastern");
       ZonedDateTime zoned1 = ZonedDateTime.of(2018, 8, 30, 6, 15,12,22, zone);
       LocalDateTime datetime = LocalDateTime.of(2018, 8, 11, 13, 56, 10);
       
       ZonedDateTime zoned2 = ZonedDateTime.of(datetime, zone);
       System.out.println(zoned2);
        System.out.println(zoned1);
       Locale locale = Locale.getDefault();
       System.out.println(locale);
    }
    
}
