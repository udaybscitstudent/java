package F_OOP.class_and_object;
public class introduction {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}


/*
// what is oops?
Ans:- OOPS stands for Object Oriented Programming System. It is a programming paradigm that uses objects and
classes in programming. It aims to implement real-world entities like inheritance, hiding, polymorphism etc. 
in programming. The main aim of OOPS is to bind together the data and the functions that operate on them so that
 no other part of the code can access this data except that function.

characteristics of OOPS 
1. Class    
2. Object
3. Polymorphism
4. Inheritance
5. Abstraction
6. Encapsulation
7. Message Passing
8. Dynamic Binding
9. Data Hiding
10. Code Reusability
11. Overloading
12. Overriding
13. Constructor
14. Destructor
15. Interface
16. Aggregation
17. Association
18. Composition
19. Coupling
20. Cohesion
21. Delegation

what is class?
Ans:- A class is a blueprint or prototype from which objects are created. It represents the set
    of properties or methods that are common to all objects of one type. A class is a logical entity
     while an object is a physical entity. A class can be defined as a template/blueprint that describes
     the behaviors/states that the object of its type support.

what is object?
Ans:- An object is a basic unit of Object Oriented Programming and represents the real life entities.


polymorphism
Ans:- Polymorphism is the ability of a message to be displayed in more than one form 

inheritance
ans:- Inheritance is a mechanism wherein a new class is derived from an existing class. 
    The existing class is called the base class, parent class, or superclass, and the new class is 
    called the derived class, child class, or subclass. Inheritance allows for code reusability and
     establishes a relationship between classes.
    
abstraction
Ans:- Abstraction is the process of hiding the implementation details and showing only the functionality to the user.
    It helps in reducing programming complexity and effort. It allows the programmer to focus on a simplified view of the problem.

encapsulation
Ans:- Encapsulation is the technique of making the fields in a class private and providing access to
    the fields via public methods. It is a protective barrier that keeps the data and the code safe within 
    the object and prevents anyone from outside the object from directly accessing the data.

message passing
Ans:- Message passing is a way of communication between objects in object-oriented programming.

dynamic binding
Ans:- Dynamic binding is a process in which the code to be executed in response to function call 
    is not known until runtime. It allows for more flexible and extensible code, as the specific 
    implementation of a method can be determined at runtime based on the actual object type.

data hiding
ans:- Data hiding is a principle of object-oriented programming that restricts access to certain details of an object, 
    such as its internal state or implementation details. It helps to protect the integrity of the object and prevent unintended interference from other parts of the program.

code reusability:-
Ans:- Code reusability is a principle of software development that encourages the use of existing code to create new functionality. 
    It allows developers to save time and effort by reusing code that has already been tested and proven to work, rather than writing new code from scratch. 
    Code reusability can be achieved through techniques such as modular programming, object-oriented programming, and the use of libraries and frameworks.

constructor
Ans:- A constructor is a special method in a class that is used to initialize objects of that class. It has the same name as the class and does not have a return type. 
    Constructors are called automatically when an object is created, and they can be used to set initial values for the object's attributes or perform any other necessary setup.   

destructor
Ans:- A destructor is a special method in a class that is used to clean up resources when an object of that class is destroyed. 
    In Java, destructors are not explicitly defined like in some other programming languages. Instead, Java uses a garbage collector to automatically manage memory and clean up objects that are no longer in use. 
    However, Java does provide a finalize() method that can be overridden in a class to perform cleanup operations before an object is garbage collected.

overloading
Ans:- Overloading is a feature in object-oriented programming that allows a class to have multiple methods with the same name but different parameters. 
    This allows for more flexibility in method calls and can make code easier to read and understand. 
    Overloading can be applied to constructors, methods, and operators.

overriding
Ans:- Overriding is a feature in object-oriented programming that allows a subclass to provide a specific implementation of a method that is already defined in its superclass. 
    When a subclass overrides a method, it provides its own version of the method that will be called instead of the superclass's version. 
    This allows for polymorphism and enables objects of different classes to be treated as if they were of the same class.

interface
Ans:- An interface is a reference type in Java that defines a set of abstract methods that a class must implement. It is a way to achieve abstraction and multiple inheritance in Java. 
    An interface can also contain constants, default methods, static methods, and nested types. 
    A class that implements an interface must provide implementations for all of its abstract methods.
*/