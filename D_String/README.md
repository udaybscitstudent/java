<div align="center">

# ☕ STRING IN JAVA

### 🚀 Data Structures & Programming Fundamentals

![Java](https://img.shields.io/badge/Language-Java-orange?style=for-the-badge\&logo=java)
![Topic](https://img.shields.io/badge/Topic-String-blue?style=for-the-badge)
![Level](https://img.shields.io/badge/Level-Beginner%20to%20Advanced-success?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Learning-purple?style=for-the-badge)

**Learn String Concepts | Master String Manipulation | Solve Programming Problems**

</div>

---

# 📌 1. Introduction to String

### ❓ What is a String?

A **String** in Java is a sequence of characters used to represent text.

In Java, String is a predefined class available in the `java.lang` package.

Strings are immutable, which means their values cannot be changed after creation.

### 🔑 Important Characteristics

* ✅ String is a predefined class in Java.
* ✅ Strings are immutable.
* ✅ Strings store a sequence of characters.
* ✅ String indexing starts from `0`.
* ✅ Strings can be created using string literals or the `new` keyword.
* ✅ Java provides several built-in methods to manipulate strings.

---

# 📚 2. String Declaration and Initialization

There are two common ways to create strings in Java.

### 🟢 1. Using String Literal

```java
String name = "Uday";
```

### 🔵 2. Using new Keyword

```java
String name = new String("Uday");
```

### 💻 Example

```java
public class StringExample {

    public static void main(String[] args) {

        String name = "Uday";

        System.out.println(name);
    }
}
```

### 📤 Output

```text
Uday
```

---

# 🔍 3. Important String Methods

Java provides several built-in methods to perform string operations.

| S.No. | Method               | Description                                                     |
| :---: | -------------------- | --------------------------------------------------------------- |
|   01  | `length()`           | Returns the length of a string.                                 |
|   02  | `charAt()`           | Returns a character at a specified index.                       |
|   03  | `toUpperCase()`      | Converts a string into uppercase.                               |
|   04  | `toLowerCase()`      | Converts a string into lowercase.                               |
|   05  | `trim()`             | Removes leading and trailing whitespace.                        |
|   06  | `equals()`           | Compares two strings by content.                                |
|   07  | `equalsIgnoreCase()` | Compares strings ignoring case differences.                     |
|   08  | `contains()`         | Checks whether a string contains a sequence.                    |
|   09  | `substring()`        | Extracts a portion of a string.                                 |
|   10  | `indexOf()`          | Returns the first matching index.                               |
|   11  | `lastIndexOf()`      | Returns the last matching index.                                |
|   12  | `replace()`          | Replaces characters or sequences.                               |
|   13  | `startsWith()`       | Checks the starting characters.                                 |
|   14  | `endsWith()`         | Checks the ending characters.                                   |
|   15  | `concat()`           | Joins two strings.                                              |
|   16  | `split()`            | Splits a string into an array.                                  |
|   17  | `isEmpty()`          | Checks whether the string has zero length.                      |
|   18  | `isBlank()`          | Checks whether the string is empty or contains only whitespace. |

---

# 🧩 4. String Comparison

Java provides different ways to compare strings.

### 🟢 equals()

Compares the actual content of two strings.

```java
String s1 = "Java";
String s2 = "Java";

System.out.println(s1.equals(s2));
```

**Output:**

```text
true
```

### 🔵 == Operator

Checks whether two references point to the same object.

```java
String s1 = new String("Java");
String s2 = new String("Java");

System.out.println(s1 == s2);
```

**Output:**

```text
false
```

### 🟣 compareTo()

Compares two strings lexicographically.

```java
String s1 = "Apple";
String s2 = "Banana";

System.out.println(s1.compareTo(s2));
```

---

# 🔄 5. String Immutability

### 📖 Definition

Immutability means that once a String object is created, its content cannot be changed.

### 💻 Example

```java
public class StringImmutable {

    public static void main(String[] args) {

        String s = "Java";

        s.concat(" Programming");

        System.out.println(s);
    }
}
```

### 📤 Output

```text
Java
```

**Reason:** The `concat()` method creates a new String instead of modifying the original String.

To store the updated value:

```java
s = s.concat(" Programming");
```

---

# 🟠 6. StringBuffer

### 📖 Definition

StringBuffer is a mutable class in Java that allows modification of string content without creating a new object for every operation.

### Important Methods

| Method       | Description                              |
| ------------ | ---------------------------------------- |
| `append()`   | Adds content at the end.                 |
| `insert()`   | Inserts content at a specified position. |
| `replace()`  | Replaces a portion of content.           |
| `delete()`   | Deletes a portion of content.            |
| `reverse()`  | Reverses the content.                    |
| `capacity()` | Returns the current buffer capacity.     |
| `length()`   | Returns the current length.              |

### 💻 Example

```java
public class BufferExample {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Java");

        sb.append(" Programming");

        System.out.println(sb);
    }
}
```

### 📤 Output

```text
Java Programming
```

---

# 🟣 7. StringBuilder

### 📖 Definition

StringBuilder is a mutable class used to modify string content.

It is generally faster than StringBuffer for single-threaded operations because it does not provide synchronization.

### 💻 Example

```java
public class BuilderExample {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java");

        sb.append(" Programming");

        System.out.println(sb);
    }
}
```

### 📤 Output

```text
Java Programming
```

### String vs StringBuffer vs StringBuilder

| Feature       | String                        | StringBuffer                | StringBuilder                 |
| ------------- | ----------------------------- | --------------------------- | ----------------------------- |
| Mutability    | Immutable                     | Mutable                     | Mutable                       |
| Thread Safety | Immutable object              | Synchronized methods        | Not synchronized              |
| Performance   | New objects for modifications | Generally slower            | Generally faster              |
| Usage         | Fixed text                    | Multithreaded modifications | Single-threaded modifications |

---

# 📂 8. Project Structure

```text
D_String/
│
├── README.md
│
├── 01_basic_string/
│   ├── string_declaration.java
│   ├── string_initialization.java
│   ├── string_length.java
│   ├── string_charAt.java
│   └── string_traversal.java
│
├── 02_string_methods/
│   ├── uppercase_lowercase.java
│   ├── string_trim.java
│   ├── string_substring.java
│   ├── string_replace.java
│   ├── string_contains.java
│   ├── string_indexOf.java
│   └── string_split.java
│
├── 03_string_comparison/
│   ├── string_equals.java
│   ├── string_equalsIgnoreCase.java
│   ├── string_compareTo.java
│   └── string_reference_comparison.java
│
├── 04_string_immutability/
│   └── string_immutable.java
│
├── 05_stringBuffer/
│   ├── stringBuffer_append.java
│   ├── stringBuffer_insert.java
│   ├── stringBuffer_delete.java
│   └── stringBuffer_reverse.java
│
├── 06_stringBuilder/
│   ├── stringBuilder_append.java
│   ├── stringBuilder_insert.java
│   ├── stringBuilder_delete.java
│   └── stringBuilder_reverse.java
│
└── 07_practice_programs/
    ├── reverse_string.java
    ├── palindrome_string.java
    ├── count_vowels_consonants.java
    ├── count_words.java
    ├── character_frequency.java
    ├── remove_whitespace.java
    ├── remove_duplicate_characters.java
    ├── anagram_string.java
    ├── string_rotation.java
    ├── first_non_repeating_character.java
    ├── longest_word.java
    └── longest_substring.java
```

---

# 🎯 9. Important String Problems

Practice these problems to improve your programming logic.

### 🟢 Beginner Level

1. Find the length of a string without using `length()`.
2. Reverse a string.
3. Check whether a string is palindrome.
4. Count vowels and consonants.
5. Count the total number of words.
6. Convert lowercase into uppercase.
7. Remove all whitespace from a string.
8. Count the frequency of a character.

### 🔵 Intermediate Level

1. Check whether two strings are anagrams.
2. Remove duplicate characters from a string.
3. Find the first and last occurrence of a character.
4. Find the first non-repeating character.
5. Find the longest word in a sentence.
6. Check whether one string is a rotation of another.
7. Sort characters in alphabetical order.
8. Find duplicate characters in a string.

### 🔴 Advanced Level

1. Find the longest palindromic substring.
2. Find the longest substring without repeating characters.
3. Implement string pattern matching.
4. Find the longest common prefix.
5. Find the minimum number of characters required to make a palindrome.
6. Implement string compression.
7. Find all permutations of a string.
8. Implement KMP Pattern Matching Algorithm.

---

# 📊 10. Important String Concepts

| Concept               | Description                                                  |
| --------------------- | ------------------------------------------------------------ |
| String Pool           | Special memory area used to reuse string literals.           |
| Immutability          | String content cannot be modified after creation.            |
| String Literal        | A string created using double quotation marks.               |
| String Object         | An object of the String class.                               |
| String Buffer         | Mutable and synchronized character sequence.                 |
| String Builder        | Mutable and non-synchronized character sequence.             |
| Lexicographical Order | Dictionary-like comparison of strings.                       |
| Regular Expression    | Pattern used to search or validate text.                     |
| ASCII                 | Character encoding standard.                                 |
| Unicode               | Standard for representing characters across writing systems. |

---

# 🏆 11. Learning Outcomes

After completing this topic, I aim to understand:

* 📌 Introduction to String in Java.
* 📌 String declaration and initialization.
* 📌 Built-in String methods.
* 📌 String comparison.
* 📌 String immutability.
* 📌 String Pool.
* 📌 StringBuffer and StringBuilder.
* 📌 String manipulation techniques.
* 📌 Pattern matching.
* 📌 Interview-level String problems.

---

# 🛠️ 12. Technologies Used

| Technology      | Purpose              |
| --------------- | -------------------- |
| ☕ Java          | Programming Language |
| 💻 VS Code      | Code Editor          |
| 🔧 JDK          | Java Development Kit |
| 🐙 Git & GitHub | Version Control      |

---

# 📈 13. Learning Progress

| Topic                    |     Status    |
| ------------------------ | :-----------: |
| String Basics            |  🟢 Learning  |
| String Methods           | 🟡 Practicing |
| String Comparison        | 🟡 Practicing |
| String Immutability      | 🟡 Practicing |
| StringBuffer             |  🔴 Upcoming  |
| StringBuilder            |  🔴 Upcoming  |
| String Practice Problems |  🔴 Upcoming  |

*Progress will be updated as I complete each topic.*

---

<div align="center">

# 🌟 Keep Learning | Keep Practicing | Keep Coding

### 💻 Happy Coding!

**Developed & Maintained by Uday Kumar**

![Made with Java](https://img.shields.io/badge/Made%20With-Java-orange?style=flat-square\&logo=java)

</div>
