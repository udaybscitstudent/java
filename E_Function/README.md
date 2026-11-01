<div align="center">

# ☕ FUNCTIONS (METHODS) IN JAVA

### 🚀 Programming Fundamentals & Problem Solving

![Java](https://img.shields.io/badge/Language-Java-orange?style=for-the-badge\&logo=java)
![Topic](https://img.shields.io/badge/Topic-Functions-blue?style=for-the-badge)
![Level](https://img.shields.io/badge/Level-Beginner%20to%20Advanced-success?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Learning-purple?style=for-the-badge)

**Learn Methods | Improve Code Reusability | Develop Programming Logic**

</div>

---

# 📌 1. Introduction to Functions (Methods)

### ❓ What is a Function?

A function is a block of code designed to perform a specific task.

In Java, functions are generally defined inside classes and are called **Methods**.

Methods help divide a large program into smaller, manageable, and reusable blocks of code.

### 🔑 Important Characteristics

* ✅ Methods help achieve code reusability.
* ✅ Methods reduce code duplication.
* ✅ Methods make programs easier to understand.
* ✅ Methods can accept parameters.
* ✅ Methods can return values.
* ✅ A method can be called multiple times.

---

# 📚 2. Types of Methods in Java

Java methods can be classified into different categories.

### 🟢 1. Predefined Methods

Methods that are already provided by Java libraries are known as predefined or built-in methods.

**Examples:**

```java
System.out.println("Hello Java");

Math.sqrt(25);

Math.max(10, 20);
```

### 🔵 2. User-Defined Methods

Methods created by programmers to perform specific tasks are known as user-defined methods.

**Example:**

```java
public class Example {

    static void display() {
        System.out.println("Hello Java");
    }

    public static void main(String[] args) {
        display();
    }
}
```

---

# 🧩 3. Method Declaration and Syntax

### 💻 Syntax

```java
access_modifier static return_type method_name(parameters) {

    // Method body

    return value;
}
```

### 🔍 Components of a Method

| Component       | Description                                   |
| --------------- | --------------------------------------------- |
| Access Modifier | Defines the accessibility of a method.        |
| `static`        | Allows calling a method using the class name. |
| Return Type     | Specifies the type of value returned.         |
| Method Name     | Name used to identify the method.             |
| Parameters      | Variables that receive values.                |
| Method Body     | Contains statements to perform a task.        |
| Return          | Sends a value back to the calling method.     |

---

# 🟢 4. Methods Based on Parameters and Return Types

There are four common combinations of methods.

### 1. Without Parameters and Without Return Value

```java
static void display() {
    System.out.println("Welcome to Java");
}
```

### 2. With Parameters and Without Return Value

```java
static void add(int a, int b) {
    System.out.println(a + b);
}
```

### 3. Without Parameters and With Return Value

```java
static int getNumber() {
    return 100;
}
```

### 4. With Parameters and With Return Value

```java
static int add(int a, int b) {
    return a + b;
}
```

---

# 🔵 5. Static and Non-Static Methods

### 🟢 Static Method

A static method belongs to the class rather than an individual object.

It can be called directly from a static context within the same class or using the class name.

```java
class Example {

    static void display() {
        System.out.println("Static Method");
    }

    public static void main(String[] args) {
        Example.display();
    }
}
```

### 🔵 Non-Static Method

A non-static method belongs to an instance of a class and requires an object for invocation.

```java
class Example {

    void display() {
        System.out.println("Non-Static Method");
    }

    public static void main(String[] args) {

        Example obj = new Example();

        obj.display();
    }
}
```

---

# 🟣 6. Method Overloading

### 📖 Definition

When a class contains multiple methods with the same name but different parameter lists, it is known as method overloading.

### 💻 Example

```java
class Addition {

    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

        System.out.println(add(10, 20));

        System.out.println(add(10, 20, 30));

        System.out.println(add(10.5, 20.5));
    }
}
```

### 📤 Output

```text
30
60
31.0
```

**Important:** Method overloading is an example of compile-time polymorphism.

---

# 🟠 7. Recursion

### 📖 Definition

Recursion is a programming technique in which a method calls itself repeatedly until a specified condition is satisfied.

Every recursive method should have a base condition to stop recursion.

### 💻 Example: Factorial Using Recursion

```java
class Factorial {

    static int factorial(int n) {

        if(n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        System.out.println(factorial(5));
    }
}
```

### 📤 Output

```text
120
```

### Important Recursion Problems

* Factorial of a number.
* Fibonacci series.
* Sum of natural numbers.
* Reverse a number.
* Calculate power of a number.
* Sum of digits.

---

# 🟡 8. Method Calling

Method calling means invoking a method to execute its statements.

### Types of Method Calling

1. Calling a static method.
2. Calling a non-static method.
3. Calling a method with arguments.
4. Calling a method with a return value.
5. Calling one method from another method.

### Important Concept: Call by Value

Java always uses **call by value**.

It passes a copy of the value to the method. For objects, the copied value is the object reference.

---

# 📂 9. Project Structure

```text
E_Function/
│
├── README.md
│
├── 01_basic_methods/
│   ├── simple_method.java
│   ├── method_with_parameter.java
│   ├── method_with_return_type.java
│   └── method_without_return_type.java
│
├── 02_types_of_methods/
│   ├── predefined_method.java
│   ├── user_defined_method.java
│   ├── static_method.java
│   └── non_static_method.java
│
├── 03_method_overloading/
│   ├── method_overloading.java
│   └── different_parameter_methods.java
│
├── 04_recursion/
│   ├── factorial.java
│   ├── fibonacci.java
│   ├── sum_of_natural_numbers.java
│   ├── power_of_number.java
│   └── reverse_number.java
│
├── 05_method_calling/
│   ├── method_calling.java
│   ├── nested_method_call.java
│   └── call_by_value.java
│
└── 06_practice_programs/
    ├── prime_number.java
    ├── palindrome_number.java
    ├── armstrong_number.java
    ├── perfect_number.java
    ├── calculator.java
    └── greatest_of_three.java
```

---

# 🎯 10. Important Practice Programs

Practice these programs to improve your programming logic.

### 🟢 Beginner Level

1. Write a method to add two numbers.
2. Write a method to find the square of a number.
3. Write a method to calculate the area of a circle.
4. Write a method to find the greatest of two numbers.
5. Write a method to check even or odd.
6. Write a method to calculate simple interest.

### 🔵 Intermediate Level

1. Find the factorial of a number using a method.
2. Check whether a number is prime using a method.
3. Find the Fibonacci series using recursion.
4. Reverse a number using a method.
5. Check whether a number is palindrome.
6. Calculate the power of a number.
7. Create a calculator using method overloading.
8. Find the sum of digits using recursion.

### 🔴 Advanced Level

1. Find GCD and LCM using methods.
2. Implement recursive binary search.
3. Find the sum of array elements using recursion.
4. Generate all permutations of a string using recursion.
5. Solve Tower of Hanoi using recursion.
6. Find the maximum element in an array using recursion.

---

# 📊 11. Important Concepts

| Concept            | Description                                      |
| ------------------ | ------------------------------------------------ |
| Method             | Block of code that performs a specific task.     |
| Parameter          | Variable declared in a method definition.        |
| Argument           | Actual value passed during method calling.       |
| Return Type        | Type of value returned by a method.              |
| Static Method      | Method associated with a class.                  |
| Instance Method    | Method associated with an object.                |
| Method Overloading | Same method name with different parameter lists. |
| Recursion          | A method calling itself.                         |
| Method Signature   | Method name and parameter types.                 |
| Call by Value      | Passing a copy of a value to a method.           |

---

# 🏆 12. Learning Outcomes

After completing this topic, I aim to understand:

* 📌 Introduction to Java methods.
* 📌 Method declaration and calling.
* 📌 Parameters and arguments.
* 📌 Return types.
* 📌 Static and non-static methods.
* 📌 Predefined and user-defined methods.
* 📌 Method overloading.
* 📌 Recursion.
* 📌 Call by value.
* 📌 Problem-solving using methods.

---

# 🛠️ 13. Technologies Used

| Technology      | Purpose              |
| --------------- | -------------------- |
| ☕ Java          | Programming Language |
| 💻 VS Code      | Code Editor          |
| 🔧 JDK          | Java Development Kit |
| 🐙 Git & GitHub | Version Control      |

---

# 📈 14. Learning Progress

| Topic                       |     Status    |
| --------------------------- | :-----------: |
| Basic Methods               |  🟢 Learning  |
| Parameters & Return Types   | 🟡 Practicing |
| Static & Non-Static Methods | 🟡 Practicing |
| Method Overloading          |  🔴 Upcoming  |
| Recursion                   |  🔴 Upcoming  |
| Method Calling              |  🔴 Upcoming  |
| Practice Problems           |  🔴 Upcoming  |

*Progress will be updated as I complete each topic.*

---

<div align="center">

# 🌟 Keep Learning | Keep Practicing | Keep Coding

### 💻 Happy Coding!

**Developed & Maintained by Uday Kumar**

![Made with Java](https://img.shields.io/badge/Made%20With-Java-orange?style=flat-square\&logo=java)

</div>
