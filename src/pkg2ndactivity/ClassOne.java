/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2ndactivity;
import java.util.Stack;
/**
 *
 * @author Student
 */
public class ClassOne {
    
    int max;
    double[] Stack;
    int top;
    Stack<Double> stacknew = new Stack<>();

    public ClassOne(int Size) {
        max = Size;
        Stack = new double[max];
        top = -1;
    }
    public void push(double number) {
        if (!isFull()) {
            Stack[++top] = number;
        }
        else {
            System.out.println("STACK IS FULL.");
        }
    }
    public double pop() {
        if (!isEmpty()) {
            return Stack[top--];
        }
        else {
            System.out.println("STACK IS EMPTY.");
            return -1;
        }
    }
    public void stackloop() {
        if (isEmpty()) {
            System.out.println("STACK IS EMPTY.");
        }
        else {
            System.out.println("STACK: ");
            for (int i = top; i >= 0; i--) {
                System.out.println(Stack[i]);
            }
        }
    }
    public void newloopstack() {
        if (isEmpty()) {
            System.out.println("STACK IS EMPTY.");
        }
        else {
            System.out.println("NEW STACK ELEMENT: ");
            for (int i = 0; i <= top; i++) {
                System.out.println(stacknew.get(i));
            }
        }
    }
    public boolean isEmpty() {
        return (top == -1);
    }
    public boolean isFull() {
        return (top == max - 1);
    }
}



    