/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DistanceLang;
import static java.lang.Math.cos;
import static java.lang.Math.sin;
import java.util.Scanner;
/**
 *
 * @author Student
 */
public class DistanceLang {
    
    double x1;
    double x2;
    double y1;
    double y2;
    double rad;
    double ans;
    
    public void dis(){
        Scanner scn = new Scanner (System.in);
        
        System.out.println("\nEnter X1: ");
        x1 = scn.nextDouble();
        System.out.println("\nEnter X2: ");
        x2 = scn.nextDouble();
        System.out.println("\nEnter Y1: ");
        y1 = scn.nextDouble();
        System.out.println("\nEnter Y2: ");
        y2 = scn.nextDouble();
        System.out.println("\nEnter Radius: ");
        rad = scn.nextDouble();
        
        ans = rad*Math.acos(sin(x1)*sin(x2)+cos(x1)*cos(x2)*cos(y1-y2));
        
        System.out.println("The Distance Between two points on the earth surface is: " + ans);
    }
}
