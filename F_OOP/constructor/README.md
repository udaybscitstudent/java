<div align="center">

# ☕ JAVA CONSTRUCTOR

### 🚀 Object-Oriented Programming (OOP)

![Java](https://img.shields.io/badge/Language-Java-orange?style=for-the-badge\&logo=java)
![OOP](https://img.shields.io/badge/Concept-OOP-blue?style=for-the-badge)
![Topic](https://img.shields.io/badge/Topic-Constructor-purple?style=for-the-badge)
![Learning](https://img.shields.io/badge/Status-Learning-success?style=for-the-badge)

**Understanding Object Initialization Through Constructors in Java**

</div>

---

## 📌 1. Introduction to Constructor

### ❓ What is a Constructor?

A **constructor** in Java is a special member of a class that is used to initialize objects.

Important characteristics of a constructor:

* 🔹 The constructor name must be the same as the class name.
* 🔹 It does not have any return type, not even `void`.
* 🔹 It is automatically called when an object is created.
* 🔹 It is used to initialize instance variables.
* 🔹 Java does not have a separate destructor like C++. It uses **Garbage Collection (GC)** to manage memory.

---

## 📚 2. Types of Constructors

In Java, constructors can be classified into the following categories:

1. 🟢 Default Constructor
2. 🔵 No-Argument Constructor
3. 🟣 Parameterized Constructor
4. 🟠 Copy Constructor

### Other Constructor Concepts

* Constructor Overloading
* Constructor Chaining
* Constructor Inheritance (Important: Constructors are not inherited in Java.)

---

## 🟢 3. Default Constructor

### 📖 Definition

A default constructor is a constructor automatically provided by the Java compiler when a class does not explicitly declare any constructor.

It initializes instance variables with their default values.

### Default Values in Java

| Data Type       | Default Value |
| --------------- | ------------- |
| `byte`          | `0`           |
| `short`         | `0`           |
| `int`           | `0`           |
| `long`          | `0L`          |
| `float`         | `0.0f`        |
| `double`        | `0.0d`        |
| `char`          | `'\u0000'`    |
| `boolean`       | `false`       |
| Reference Types | `null`        |

### 💻 Example

```java
class Student {

    int id;
    float marks;
    String name;

    public static void main(String[] args) {

        Student s = new Student();

        System.out.println(s.id);
        System.out.println(s.marks);
        System.out.println(s.name);
    }
}
```

### 📤 Output

```text
0
0.0
null
```

---

## 🔵 4. No-Argument Constructor

### 📖 Definition

A constructor that does not accept any parameters is known as a no-argument constructor.

It is explicitly defined by the programmer.

### 💻 Syntax

```java
class ClassName {

    ClassName() {
        // Initialization code
    }
}
```

---

## 🟣 5. Parameterized Constructor

### 📖 Definition

A constructor that accepts one or more parameters to initialize the data members of a class is known as a parameterized constructor.

### 💻 Syntax

```java
class Student {

    int id;
    String name;

    Student(int i, String n) {
        id = i;
        name = n;
    }
}
```

---

## 🟠 6. Constructor Overloading

### 📖 Definition

When a class contains more than one constructor with different parameter lists, it is known as constructor overloading.

It allows objects to be initialized in different ways.

## prgoram: - write a program to add two number or three number using constructor overloading

```java
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
        System.out.println(s.show());

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

```

---

## 🔴 7. Constructor Chaining

### 📖 Definition

Calling one constructor from another constructor is known as constructor chaining.

Java provides two important ways:

* `this()` – Calls another constructor of the same class.
* `super()` – Calls the constructor of the parent class.

---

## 🟡 8. Copy Constructor

### 📖 Definition

A constructor that creates an object by copying the values of another object of the same class is known as a copy constructor.

**Note:** Java does not provide a built-in copy constructor. Programmers can define one manually.

### 💻 Syntax

```java
class Student {

    int id;

    Student(int i) {
        id = i;
    }

    Student(Student s) {
        id = s.id;
    }
}
```

---

## 📂 9. Project Structure

```text
F_OOP/
│
└── constructor/
    │
    ├── intro.java
    ├── default_constructor.java
    ├── no_argument.java
    ├── parameterized_constructor.java
    ├── constructor_overloading.java
    ├── constructor_chaining.java
    └── copy_constructor.java
```

---

## 🎯 10. Important Points to Remember

* ✅ Constructor name must be the same as the class name.
* ✅ Constructors do not have a return type.
* ✅ Constructors are called automatically when an object is created.
* ✅ Constructors are used to initialize objects.
* ✅ Java provides a default constructor if no constructor is explicitly declared.
* ✅ Constructors can be overloaded.
* ✅ Constructors are not inherited in Java.
* ✅ Java uses Garbage Collection instead of a traditional destructor.

---

## 🏆 11. Learning Outcomes

After completing this topic, you will understand:

* 📌 Introduction to constructors.
* 📌 Default and no-argument constructors.
* 📌 Parameterized constructors.
* 📌 Constructor overloading.
* 📌 Constructor chaining.
* 📌 Copy constructors.
* 📌 Object initialization in Java.

---

## 📝 12. Practice / Homework

Try solving these programming problems:

1. Write a Java program to demonstrate a default constructor.
2. Write a Java program to initialize student details using a no-argument constructor.
3. Write a Java program to calculate the area of a rectangle using a parameterized constructor.
4. Write a Java program to demonstrate constructor overloading.
5. Write a Java program to demonstrate constructor chaining.
6. Write a Java program to copy the values of one object into another using a copy constructor.

---

<div align="center">

### 🌟 Keep Learning | Keep Practicing | Keep Coding

**Author: Uday Kumar**

![Made with Java](https://img.shields.io/badge/Made%20With-Java-orange?style=flat-square\&logo=java)

</div>
