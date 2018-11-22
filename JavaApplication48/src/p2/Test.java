/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.String;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.ToIntFunction;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import static jdk.nashorn.internal.objects.NativeArray.indexOf;
//import p1.*;
//import p3.*;

/**
 *
 * @author socialclimber
 */
class Emp {
String fName;
String lName;
public Emp (String fn, String ln) {
fName = fn;
lName = ln;
}
public String getfName() { return fName; }
public String getlName() { return lName; }
}
public class Test {
    public static void main(String[] args) throws FileNotFoundException, IOException{
       // DoInterface doi = new Doclass();
       // doi.m1(100);
       // doi.m2(200);
String str = "Java is a programming language";
ToIntFunction<String> indexVal = str::indexOf; //line n1
int x = indexVal.applyAsInt("Java");//line n2
System.out.println(x);
    }
}
