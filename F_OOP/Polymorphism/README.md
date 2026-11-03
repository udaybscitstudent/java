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

| No. | Practice Questions                                                                                       | Program                      |
| :-: | :------------------------------------------------------------------------------------------------------- | :--------------------------- |
|  01 | Write a Java program to perform addition and subtraction of two numbers using compile-time polymorphism. | [add_sub.java](add_sub.java) |
|  02 | Write a Java program to calculate the area of a circle using compile-time polymorphism.                  | [circle.java](circle.java)   |

---

<h2 align="center">🔵 2. Run-Time Polymorphism</h2>

**Run-Time Polymorphism:** A type of polymorphism in which the behavior of an object changes at runtime and displays different properties according to the object assigned to the reference variable is known as Run-Time Polymorphism.

It is achieved through **Method Overriding**.

### ✨ Key Features

* Two or more classes must have an inheritance relationship.
* The child class must override the parent class method.
* The method name and parameters must be the same.
* The parent class reference can refer to a child class object.
* The JVM determines which overridden method to execute at runtime.

### 🔹 Syntax

```java
class A {

    // Parent class
    // Method definition

}

class B extends A {

    // Child class
    // Method overriding

}

class Example {

    public static void main(String args[]) {

        A z;

        z = new A();

        z = new B();

    }
}
```

**Explanation:**

* `A z;` - Creates a reference variable of class A.
* `z = new A();` - Assigns an object of class A.
* `z = new B();` - Assigns an object of class B to the parent class reference.

This is known as **Dynamic Method Dispatch**.

---

<h2 align="center">💻 Example: Bank Interest Calculation</h2>

**Program:** Write a Java program to calculate the interest amount of different banks using Run-Time Polymorphism.

### 🏦 Bank Interest Rates

| Bank Name | Interest Rate |
| :-------- | :-----------: |
| SBI       |      4.5%     |
| CB        |      4.0%     |
| PNB       |      4.7%     |

### 📜 Source Code

```java
import java.util.Scanner;

class Bank {

    double getInterest(double principal) {
        return 0;
    }

}

class SBI extends Bank {

    @Override
    double getInterest(double principal) {
        return principal * 4.5 / 100;
    }

}

class CB extends Bank {

    @Override
    double getInterest(double principal) {
        return principal * 4.0 / 100;
    }

}

class PNB extends Bank {

    @Override
    double getInterest(double principal) {
        return principal * 4.7 / 100;
    }

}

class BankInterest {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal Amount: ");
        double amount = sc.nextDouble();

        Bank b;

        b = new SBI();
        System.out.println("SBI Interest = " + b.getInterest(amount));

        b = new CB();
        System.out.println("CB Interest = " + b.getInterest(amount));

        b = new PNB();
        System.out.println("PNB Interest = " + b.getInterest(amount));

        sc.close();

    }
}
```

### 📤 Output

```text
Enter Principal Amount: 10000

SBI Interest = 450.0
CB Interest = 400.0
PNB Interest = 470.0
```

### 🔍 How Does Run-Time Polymorphism Work Here?

1. `Bank b;` - Creates a parent class reference variable.
2. `b = new SBI();` - The reference points to an SBI object.
3. `b.getInterest(amount);` - Calls the overridden method of SBI.
4. `b = new CB();` - The same reference now points to a CB object.
5. `b = new PNB();` - The same reference now points to a PNB object.

The JVM decides which method to execute based on the actual object at runtime.

---

<h2 align="center">📚 Important Points</h2>

| Concept                 | Description                                 |
| :---------------------- | :------------------------------------------ |
| Polymorphism            | One thing having many forms                 |
| Method Overloading      | Same method name with different parameters  |
| Compile-Time            | Method selection happens at compile time    |
| Run-Time                | Method selection happens at runtime         |
| Compile-Time Technique  | Method Overloading                          |
| Run-Time Technique      | Method Overriding                           |
| Dynamic Method Dispatch | Parent reference pointing to a child object |

---

<div align="center">

### ⚠️ Important Notes

* Changing only the return type of a method does not achieve method overloading in Java.
* Method overriding requires inheritance.
* Static methods cannot be overridden in the runtime polymorphism sense.
* Runtime polymorphism works through method overriding and dynamic method dispatch.

---

### 🚀 Keep Learning & Keep Coding!

**Happy Coding! ☕**

</div>
