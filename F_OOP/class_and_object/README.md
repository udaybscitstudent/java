<div align="center">

# ☕ JAVA CLASS & OBJECT

### 🚀 Object-Oriented Programming (OOP)

![Java](https://img.shields.io/badge/Language-Java-orange?style=for-the-badge\&logo=java)
![OOP](https://img.shields.io/badge/Concept-OOP-blue?style=for-the-badge)
![Topic](https://img.shields.io/badge/Topic-Class%20%26%20Object-purple?style=for-the-badge)
![Learning](https://img.shields.io/badge/Status-Learning-success?style=for-the-badge)

**Understanding the Building Blocks of Object-Oriented Programming**

</div>

---

## 📌 1. Introduction to Class and Object

Java is an object-oriented programming language (OOP) that uses classes and objects to organize code.

The two fundamental concepts of OOP are:

* 🔹 Class
* 🔹 Object

### 🟢 What is a Class?

A **class** is a blueprint or template used to create objects. It defines the properties (data members) and behaviours (methods) of objects.

**Example:** Student, Employee, Car, Animal, etc.

### 🔵 What is an Object?

An **object** is an instance of a class. It represents a real-world entity and contains its own state and behaviour.

An object is generally created using the `new` keyword in Java.

---

## 📚 2. Difference Between Class and Object

| Class                                          | Object                                                  |
| ---------------------------------------------- | ------------------------------------------------------- |
| A class is a blueprint of an object.           | An object is an instance of a class.                    |
| It is a logical entity.                        | It is a runtime entity.                                 |
| It defines properties and behaviours.          | It contains actual values and uses behaviours.          |
| A class is declared using the `class` keyword. | An object is generally created using the `new` keyword. |
| Example: Student                               | Example: Student s1 = new Student();                    |

---

## 💻 3. Syntax of Class and Object

```java
class ClassName {

    // Data Members
    int id;
    String name;

    // Member Method
    void display() {
        System.out.println(id);
        System.out.println(name);
    }

    public static void main(String[] args) {

        // Object Creation
        ClassName obj = new ClassName();

        // Accessing Members
        obj.id = 101;
        obj.name = "Uday";

        obj.display();
    }
}
```

### 📤 Output

```text
101
Uday
```

---

## 🧩 4. Important Components of a Class

A Java class generally contains the following components:

| Component      | Description                                     |
| -------------- | ----------------------------------------------- |
| Data Members   | Variables declared inside a class.              |
| Member Methods | Methods that define the behaviour of an object. |
| Constructor    | Special member used to initialize objects.      |
| Object         | Instance of a class.                            |
| Main Method    | Entry point of a Java application.              |

---

## 🔑 5. Object Creation in Java

An object can be created using the `new` keyword.

### Syntax

```java
ClassName objectName = new ClassName();
```

### Understanding Object Creation

```java
Student s1 = new Student();
```

* `Student` → Class Name.
* `s1` → Reference Variable.
* `new` → Keyword used to create an object.
* `Student()` → Constructor call.

**Note:** The object is created in heap memory, while the reference variable may be stored in a stack frame when declared locally.

---

## 🏗️ 6. Multiple Objects of a Class

A single class can be used to create multiple objects.

### Example

```java
class Student {

    int roll;
    String name;

    void display() {
        System.out.println("Roll: " + roll);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();

        s1.roll = 101;
        s1.name = "Uday";

        s2.roll = 102;
        s2.name = "Rahul";

        s1.display();
        s2.display();
    }
}
```

### 📤 Output

```text
Roll: 101
Name: Uday

Roll: 102
Name: Rahul
```

---

## 📂 7. Project Structure

```text
F_OOP/
│
└── class_object/
    │
    ├── student.java
    ├── employee.java
    ├── multiple_object.java
    └── student_details.java
```

---

## 🎯 8. Important Points to Remember

* ✅ A class is a blueprint of an object.
* ✅ An object is an instance of a class.
* ✅ A class is declared using the `class` keyword.
* ✅ Objects are generally created using the `new` keyword.
* ✅ A class can contain multiple data members and methods.
* ✅ Multiple objects can be created from a single class.
* ✅ Each object has its own instance variables.
* ✅ Objects help implement real-world entities in programming.

---

## 🏆 9. Learning Outcomes

After completing this topic, you will understand:

* 📌 Introduction to Class and Object.
* 📌 Declaration of a class.
* 📌 Object creation in Java.
* 📌 Accessing data members and methods.
* 📌 Understanding reference variables.
* 📌 Creating multiple objects from a single class.
* 📌 Real-world implementation of OOP concepts.

---

## 📝 10. Practice / Homework

Try solving these programming problems:

1. Write a Java program to create a Student class and display student details.
2. Write a Java program to create an Employee class and calculate employee salary.
3. Write a Java program to create a Rectangle class and calculate its area and perimeter.
4. Write a Java program to create a BankAccount class and display account details.
5. Write a Java program to create multiple objects of a Student class.
6. Write a Java program to create a Car class with brand, model and price as data members.

---

<div align="center">

### 🌟 Keep Learning | Keep Practicing | Keep Coding

**Author: Uday Kumar**

![Made with Java](https://img.shields.io/badge/Made%20With-Java-orange?style=flat-square\&logo=java)

</div>
