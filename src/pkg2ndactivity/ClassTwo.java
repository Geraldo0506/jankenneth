/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2ndactivity;

/**
 *
 * @author Student
 */
public class ClassTwo extends ClassOne {
   
    public ClassTwo(int Size) {
        super(Size);
    }

    public void count() {
        if (!isEmpty()) {
            int sum = top + 1;
            System.out.println("ELEMENTS IN THE STACK: " + sum);
        }
        else {
            System.out.println("ELEMENTS IN THE STACK IS EMPTY.");
        }
    }
}



    