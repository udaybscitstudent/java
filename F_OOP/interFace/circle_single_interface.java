// write a program to compute area and circumferance of circle by using single interface.(program of single interface)

package F_OOP.interFace;

import java.util.Scanner;
public class circle_single_interface {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        float r = obj.nextInt();
        circle c = new circle();
        System.out.println("area of circle="+c.area(r));
        System.out.println("circumference of circle="+c.circumferance(r));
        obj.close();
    }
}

interface compute{
    double area(float r);
    double circumferance(float r);
}

class circle implements compute{
    public double area(float r){
        double circle_area = 3.14*r*r;
        return circle_area;
    }

    public double circumferance(float r){
        double circle_circum = 2*3.14*r;
        return circle_circum;
    }
}
