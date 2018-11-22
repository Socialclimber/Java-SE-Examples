/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclass;

/**
 *
 * @author socialclimber
 */
class Student{
    String name;
    public Student(String name){
        this.name = name;
    }
}
public class Myclass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // String s = " Java Duke ";
       // int len = s.trim().length();
       // System.out.println(len);
       Student[] students = new Student[3];
       students[1] = new Student("Richard");
       students[2] = new Student("Donald");
       for(Student s : students){
           System.out.println(""+s);
       }
    }
    
}
