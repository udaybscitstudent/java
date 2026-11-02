// write a program to compute area of circle using compile time polymorphism.

package F_OOP.Polymorphism;

import java.util.Scanner;
public class circle {
    int area(int r){
        int area_circle = (int)Math.PI * r * r;
        return area_circle;
    }

    double area(float r){
        double area_circle = Math.PI * r * r;
        return area_circle;
    }
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter integer radius:");
        int r = obj.nextInt();
        System.out.println("Enter float radius:");
        float rs = obj.nextFloat();

        // class calling
        circle c = new circle();
        System.out.println("area of circle(int)"+c.area(r));
        c.area(rs);
        System.out.println("area of circle(float)"+c.area(rs));

        obj.close();
    }
    
}
