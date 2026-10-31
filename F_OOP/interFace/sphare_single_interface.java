// write a program to compute volume of sphare or volume of cuboid by using constructor overloading.

package F_OOP.interFace;
import java.util.Scanner;
public class sphare_single_interface {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter radius:");
        int r = obj.nextInt();

        sphare s = new sphare();
        s.volume(r);
        s.surface_area(r);

        obj.close();
    }
}

interface calculate{
    void volume(float r);
    void surface_area(float r);
}

class sphare implements calculate{
    public void volume(float r){
        double v = (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
        System.out.println("volume of sphare="+v);
    }
    public void surface_area(float r){
        double sa = 4* Math.PI * Math.pow(r,2);
        System.out.println("Surface area of sphare="+sa);
    }
}
