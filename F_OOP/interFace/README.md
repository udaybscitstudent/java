# Java Interface – Introduction to Interface

## 📌 Introduction

Java provides abstraction through two mechanisms:

1. Abstract Class
2. Interface

An **Interface** in Java is a blueprint of a class that defines a set of methods that implementing classes must provide their implementations for.

Interfaces are mainly used to achieve abstraction and support multiple inheritance in Java.

### Important Keywords

* `interface` – Used to declare an interface.
* `implements` – Used by a class to implement an interface.
* `public` – Implemented interface methods must be declared public.

---

## 📚 Types of Interface Implementation

In this program, we will learn two types of interface implementation:

1. Single Interface
2. Multiple Interface

---

## 1. Single Interface

A single interface implementation occurs when one class implements one interface containing one or more abstract methods.

### Syntax

```java
interface InterfaceName {
    returnType method1();
    returnType method2();
}

class ClassName implements InterfaceName {

    public returnType method1() {
        // Method definition
    }

    public returnType method2() {
        // Method definition
    }
}
```

### Practical Programs

| S.No. | Program Name                   | Description                                                                                      |
| ----- | ------------------------------ | ------------------------------------------------------------------------------------------------ |
| 1     | `circle_single_interface.java` | Calculate the area and circumference of a circle using a single interface.                       |
| 2     | `sphare_single_interface.java` | Calculate the volume of a sphere or cuboid using constructor overloading and a single interface. |

---

## 2. Multiple Interface

Multiple interface implementation occurs when a single class implements two or more interfaces.

Java does not support multiple inheritance through classes, but it supports multiple inheritance through interfaces.

### Syntax

```java
interface Interface1 {
    returnType method1();
}

interface Interface2 {
    returnType method2();
}

interface Interface3 {
    returnType method3();
}

class ClassName implements Interface1, Interface2, Interface3 {

    public returnType method1() {
        // Method definition
    }

    public returnType method2() {
        // Method definition
    }

    public returnType method3() {
        // Method definition
    }
}
```

### Practical Program

| S.No. | Program Name                               | Description                                                                           |
| ----- | ------------------------------------------ | ------------------------------------------------------------------------------------- |
| 1     | `square_rectangle_multiple_interface.java` | Calculate the area and perimeter of a square and rectangle using multiple interfaces. |

---

## 📂 Project Structure

```text
F_OOP/
│
└── interFace/
    │
    ├── into.java
    ├── circle_single_interface.java
    ├── sphare_single_interface.java
    └── square_rectangle_multiple_interface.java
```

---

## 🎯 Key Points to Remember

1. An interface is declared using the `interface` keyword.
2. A class implements an interface using the `implements` keyword.
3. A class can implement multiple interfaces.
4. Interface abstract methods are implicitly `public` and `abstract`.
5. Implemented methods must be declared `public`.
6. Interfaces help achieve abstraction.
7. Java supports multiple inheritance through interfaces.
8. A class can implement multiple interfaces but cannot extend multiple classes.

---

## 🎓 Learning Outcomes

After completing this topic, you will understand:

* What an interface is in Java.
* How to declare and implement an interface.
* Single interface implementation.
* Multiple interface implementation.
* How interfaces support abstraction.
* How to solve mathematical problems using interfaces.

---

## 📝 Practice / Homework

**Question:** Write a Java program to calculate the area and perimeter of a square and rectangle using multiple interfaces.

**Concepts to Use:**

* Interface
* Multiple Interface Implementation
* Method Overriding
* Classes and Objects

---

## 👨‍💻 Author

**Uday Kumar**

Learning Java Programming | Object-Oriented Programming (OOP)
