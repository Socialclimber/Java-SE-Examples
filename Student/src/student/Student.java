/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 *
 * @author socialclimber
 */
public class Student {
    String course, name, city;

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public Student (String name, String course, String city) {
        this.course = course; this.name = name; this.city = city;
    }
public String toString() {
return course + ":" + name + ":" + city;
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Student> stds = Arrays.asList(
new Student ("Jessy", "Java ME", "Chicago"),
new Student ("Helen", "Java EE", "Houston"),
new Student ("Mark", "Java ME", "Chicago"));
        stds.stream()
        .collect(Collectors.groupingBy(Student::getCourse))
        .forEach((String s,List<Student> c)->System.out.println(c));
        
         List<String> nL = Arrays.asList("Jim", "John", "Jeff");
    Function<String, String> funVal = s -> "Hello : ".concat(s);
    nL.stream()
    .map(funVal)
    .peek(System.out::print);
    }
  
}
