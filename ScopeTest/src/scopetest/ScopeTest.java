/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scopetest;

public class ScopeTest {
 int j; int k;
public static void main(String[] args) {
new ScopeTest().doStuff(); 
}
void doStuff() {
int x = 5;
doStuff2();
System.out.println("x");
}

void doStuff2() {
int y = 7;
System.out.println("y");
for (int z = 0; z < 5; z++) {
System.out.println("z");
System.out.println("y");
}
}
}