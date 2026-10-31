// ex:- write a program to add two number or three number using constructor overloading.
package F_OOP.constructor;  //it is not compulsory 

import java.util.Scanner;
public class constructor_overloading {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int a = obj.nextInt();
        int b = obj.nextInt();
        int c = obj.nextInt();

        sum s = new sum();
        sum s1 = new sum(a,b);
        sum s2 = new sum(a,b,c);
        System.out.println("Sum of "+a+" and "+b+" = "+s1.display());
        System.out.println("Sum of "+a+" , "+b+" and "+c+" = "+s2.show());

        obj.close();
    }
}
class sum{
    int a , b, c;
    sum(){
        a = 0;
        b = 0;
        c = 0;
    }
    sum(int a , int b){
        this.a = a;
        this.b = b;
    }
    sum(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    int display(){
        return a+b;
    }
    
    int show(){
        return a+b+c;
    }

}


/*
constructor overloading: - 
a parameterised constructor can define inside same class with one two or more parameter and passes number
of values according to the requirement at the time of calling or instiation known as constructor overloading
this feature allow us to deine a class for many purpose.

syntax:- 
    class class1{
        //data
    }
    classs(){
        //initialize data
    }
    class1(arg1){
        //initialize data
    }
    class1(arg1, arg2){
        //initialize data.
    }
    class1(arg1 , arg2, arg3){
        //initialize data
    }

// write a program to add two number or three number using constructor overloading.

*/