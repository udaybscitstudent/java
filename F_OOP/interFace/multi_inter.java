// 1. write a program to compute area & perimeter of square and rectangle by using multiple inheriface

package F_OOP.interFace;

import java.util.Scanner;
public class multi_inter {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter side of square:");
        int s = obj.nextInt();

        System.out.println("Enter length and breath of the rectangle:");
        int l = obj.nextInt();
        int b = obj.nextInt();

        compute c = new compute();
        // calling square methods
        c.area_square(s);
        c.perimeter_square(s);

        // calling rectancle function
        int area = c.area_rectangle(l, b);
        System.out.println("Area of rectangle="+area);

        int perimeter = c.perimeter_rectangle(l, b);
        System.out.println("Perimeter of rectangle="+perimeter);

        // closing the object
        obj.close();
    }
}

interface square{
    void area_square(int s);
    void perimeter_square(int s);
}

interface rectangle{
    int area_rectangle(int l , int b);
    int perimeter_rectangle(int l , int b);
}

class compute implements square, rectangle{
    public void area_square(int s){
        System.out.println("Area of square="+Math.pow(s,2));
    }

    public void perimeter_square(int s){
        System.out.println("Perimeter of square="+4*s);
    }

    public int area_rectangle(int l , int b){
        int area = l*b;
        return area;
    }
    public int perimeter_rectangle(int l , int b){
        int perimeter= 2*(l+b);
        return perimeter;
    }
}
