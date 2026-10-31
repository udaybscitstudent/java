package F_OOP.interFace;

public class into {
    public static void main(String args[]){
        System.out.println("Introduction of Interface");
    }
}

/* 
interface:- 
The java provides the feature of abstraction through the help of 2 machenism interface & abstract class.
the interface defined as blueprint of class the methods of blueprint interface implements by the class 
which means that by the class which means that a class can abstract the methods of interface and define 
for own purpaose . the objects of class which implements interface allocate into the memory. and used by
 the class as encapsulation the keyword interface defien an interface with declaration of abstract methods 
 the keyword "implements" used to apply the interface throught he class.


types of interface
1)single intereface
2)multi interface

1)  single interface:- a type of interface which contain so many abstract method wihch implements 
    by single class only known as single interface

syntax:- 
interface name_interface{
    returntype method1();
    returntype method2(arg1,...);
}

class class1 implements name_interface{
    public returntype method1(){
    //define
    }
    public returntype method2(){
    //define
    }
}

// write a program to compute area and circumferance of circle by using single interface.[code written in the 'circle_single_interface.java' program]
// write a program to compute volume of sphare or volume of cuboid by using constructor overloading.[code written in the sphare_single_interface.java program]



// multiple interface

2)  multiple interface:- a type of interace in which two or more different interface implements through
    single class known as multiple interface. this feature is like a multiple inheritance in java where a 
    difference type of properties are abstructed by single class.

syntax:- 

interface interface1{
    returntype method1();
}

interface interface2{
    returntyep method2();
}

interface interface3{
    returntye method3();
}

class class1 implements interface1 , interface2, interface3{
    public returntype method1(){
    // define;
    }
    public returnType method2(){
    // define
    }
    public returnType method3(){
    //define
    }
}

// home work program //
1. write a program to compute area & perimeter of square and rectangle by using multiple inheriface

*/