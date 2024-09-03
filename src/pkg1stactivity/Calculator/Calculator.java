/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg1stactivity.Calculator;
import java.util.Scanner;
/**
 *
 * @author Student
 */
public class Calculator {
    int num1;
    int num2;
    int add;
    int sub;
    int mul;
    double div;
    double rem;
    
    public void math(){
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter first number: ");
        num1 = scn.nextInt();
        System.out.println("Enter second number: ");
        num2 = scn.nextInt();
        
        add = num1 + num2;
        sub = num1 - num2;
        mul = num1 * num2;
        div = num1 / num2;
        rem = num1 % num2;
        
        System.out.println("Addition: " + add);
        
        System.out.println("Substraction: " + sub);
        
        System.out.println("Multiplication: " + mul);
        
        System.out.println("Division: " + div);
        
        System.out.println("Remainder: " + rem);
    }
}
