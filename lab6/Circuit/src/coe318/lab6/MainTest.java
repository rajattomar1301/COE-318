/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab6;

/**
 *
 * @author satchel
 */
public class MainTest {
    
    public static void main(String[] args) {
        
        Circuit c1 = Circuit.getInstance();
        
        Node A = new Node();
        Node B = new Node();
        Node C = new Node();
        System.out.println(A.toString());
        System.out.println(B.toString());
        System.out.println(C.toString());

        Resistor r1 = new Resistor(50.0, A, B);
        Resistor r2 = new Resistor(70.0, B, C);
        System.out.println(r1.toString());
        System.out.println(r2.toString());
        
        System.out.println("\nCircuit");
        
        c1.add(r1);
        c1.add(r2);
        System.out.println(c1.toString());
    }
    
}
