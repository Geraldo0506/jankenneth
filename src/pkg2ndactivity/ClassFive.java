/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2ndactivity;

/**
 *
 * @author Student
 */
public class ClassFive extends ClassFour {
    
    public ClassFive(int Size) {
        super(Size);
    }

    public void addStack() {
        for (int i = 0; i <= top; i++) {
            if (!isFull()) {
                System.out.println("STACK COLLECTION ADDED TO ANOTHER STACK COLLECTION: " + Stack[i]);
                stacknew.push(Stack[i]);
            }
            else {
                System.out.println("STACK IS FULL.");
            }
        }
    }
}




    