package F_OOP.constructor;

public class parameterized_constructor {
    public static void main(String args[]){
        student obj = new student(15 , "uday");
        System.out.println(obj.name);
    }
}

class student{
    int id;
    String name;
    student(int id , String name){
        this.id = id;
        this.name = name;
    }
} 


/*
Constructor with parameter: - 
A type of constructor which declare & define inside a class with same name of class and have parameter
to passes the data at the time of object instantiation known as constructor parameter.

syntax:- 

    class class1{
        //data
    }
    class1(){
        // initialize;
    }
    class1(datatype a , datatype b, .......){
        //initialize the data member of class.
    }

ex:- write a program to take a number and compute the square of that number by using parameter constructor.


*/