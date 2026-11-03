<div align="center">

# 🌟 POLYMORPHISM IN JAVA

### 🔷 Object-Oriented Programming (OOP)

![Java](https://img.shields.io/badge/Language-Java-orange?style=for-the-badge\&logo=java)
![OOP](https://img.shields.io/badge/Concept-OOP-blue?style=for-the-badge)
![Topic](https://img.shields.io/badge/Topic-Polymorphism-purple?style=for-the-badge)

---

</div>

## 📌 What is Polymorphism?

**Polymorphism** means *Many Forms*. It is one of the core features of Object-Oriented Programming (OOP).

It allows us to define multiple methods with the **same name but different parameters** inside a class. This concept is known as **Method Overloading**.

### 🔹 Types of Polymorphism

In Java, polymorphism is categorized into two types:

1. 🟢 Compile-Time Polymorphism
2. 🔵 Run-Time Polymorphism

---

<h2 align="center">🟢 1. Compile-Time Polymorphism</h2>

Compile-time polymorphism is a type of polymorphism in which the compiler determines which method should be executed based on the number, type, or order of parameters.

It is achieved through **Method Overloading**.

### ✨ Key Features

* Multiple methods can have the same name.
* Methods must have different parameter lists.
* Parameters can differ in number, type, or order.
* The compiler decides which method to call at compile time.

---

<h2 align="center">💻 Example: Display Integer and Float</h2>

**Program:** Write a Java program to display integer and float values using compile-time polymorphism.

### 📜 Source Code

```java
import java.util.Scanner;

class Display {

    void show(int x) {
        System.out.println("Integer = " + x);
    }

    void show(float x) {
        System.out.println("Float = " + x);
    }

    public static void main(String args[]) {

        Scanner obj = new Scanner(System.in);

        int a = obj.nextInt();
        float b = obj.nextFloat();

        Display d = new Display();

        d.show(a);
        d.show(b);

        obj.close();
    }
}
```

### 📤 Output

```text
10
20.5
Integer = 10
Float = 20.5
```

---

<h2 align="center">📝 Homework / Practice Programs</h2>

| No. | Practice Questions                                                                                       | Program |
| :-: | -------------------------------------------------------------------------------------------------------- | ------- |
| 01  | Write a Java program to perform addition and subtraction of two numbers using compile-time polymorphism. | [add_sub.java](add_sub.java) |
| 02  | Write a Java program to calculate the area of a circle using compile-time polymorphism.                  | [circle.java](circle.java) |

---

<h2 align="center">📚 Important Points</h2>

| Concept                | Description                                |
| :--------------------- | :----------------------------------------- |
| Polymorphism           | One thing having many forms                |
| Method Overloading     | Same method name with different parameters |
| Compile-Time           | Method selection happens at compile time   |
| Run-Time               | Method selection happens at runtime        |
| Compile-Time Technique | Method Overloading                         |
| Run-Time Technique     | Method Overriding                          |

---

<div align="center">

### ⚠️ Important Note

Changing only the return type of a method does not achieve method overloading in Java.

---

### 🚀 Keep Learning & Keep Coding!

**Happy Coding! ☕**

</div>
