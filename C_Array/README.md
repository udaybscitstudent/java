<div align="center">

# ☕ ARRAY IN JAVA

### 🚀 Data Structures & Programming Fundamentals

![Java](https://img.shields.io/badge/Language-Java-orange?style=for-the-badge\&logo=java)
![Topic](https://img.shields.io/badge/Topic-Array-blue?style=for-the-badge)
![Level](https://img.shields.io/badge/Level-Beginner%20to%20Advanced-success?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Learning-purple?style=for-the-badge)

**Learn Array Concepts | Develop Logic | Solve Programming Problems**

</div>

---

# 📌 1. Introduction to Array

### ❓ What is an Array?

An **Array** is a data structure in Java that stores multiple values of the same data type in a single variable.

Each element of an array is accessed using its index, starting from `0`.

### 🔑 Important Characteristics

* ✅ Stores multiple values of the same data type.
* ✅ Uses index numbers to access elements.
* ✅ Array indexing starts from `0`.
* ✅ Array size is fixed after creation.
* ✅ Arrays are objects in Java.
* ✅ Arrays can store primitive values and object references.

---

# 📚 2. Types of Arrays in Java

Java supports different types of arrays:

### 🟢 1. One-Dimensional Array

An array that stores elements in a single sequence is called a one-dimensional array.

**Syntax:**

```java
int arr[] = new int[5];
```

**Example:**

```java
int arr[] = {10, 20, 30, 40, 50};

for(int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}
```

**Output:**

```text
10
20
30
40
50
```

### 🔵 2. Two-Dimensional Array

An array that stores elements in rows and columns is called a two-dimensional array.

**Syntax:**

```java
int arr[][] = new int[3][3];
```

**Example:**

```java
int arr[][] = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

for(int i = 0; i < 3; i++) {
    for(int j = 0; j < 3; j++) {
        System.out.print(arr[i][j] + " ");
    }
    System.out.println();
}
```

**Output:**

```text
1 2 3
4 5 6
7 8 9
```

### 🟣 3. Multidimensional Array

An array containing two or more dimensions is known as a multidimensional array.

**Example:**

```java
int arr[][][] = new int[2][2][2];
```

---

# 🛠️ 3. Basic Array Operations

| S.No. | Operation | Description                                          |
| :---: | --------- | ---------------------------------------------------- |
|   01  | Traversal | Accessing each element of an array.                  |
|   02  | Insertion | Adding an element at a specific position.            |
|   03  | Deletion  | Removing an element from an array.                   |
|   04  | Searching | Finding an element in an array.                      |
|   05  | Updating  | Modifying an existing element.                       |
|   06  | Sorting   | Arranging elements in ascending or descending order. |
|   07  | Merging   | Combining two arrays into one.                       |

---

# 🔍 4. Searching Algorithms

Searching is the process of finding a particular element in an array.

### 🟢 Linear Search

Linear search checks each element one by one until the required element is found.

**Time Complexity:** O(n)

### 🔵 Binary Search

Binary search repeatedly divides a sorted array into two halves to find the required element.

**Time Complexity:** O(log n)

**Note:** Binary search requires sorted data.

---

# 🔃 5. Sorting Algorithms

Sorting is the process of arranging array elements in a particular order.

| Algorithm      | Description                                           | Average Time Complexity |
| -------------- | ----------------------------------------------------- | ----------------------- |
| Bubble Sort    | Repeatedly swaps adjacent elements.                   | O(n²)                   |
| Selection Sort | Selects the smallest element and places it correctly. | O(n²)                   |
| Insertion Sort | Inserts elements into their correct positions.        | O(n²)                   |
| Merge Sort     | Divides the array and merges sorted parts.            | O(n log n)              |
| Quick Sort     | Uses a pivot to partition the array.                  | O(n log n)              |

---

# 📂 6. Project Structure

```text
C_Array/
│
├── README.md
│
├── 01_basic_array/
│   ├── array_declaration.java
│   ├── array_initialization.java
│   ├── array_traversal.java
│   └── array_length.java
│
├── 02_array_operations/
│   ├── array_insertion.java
│   ├── array_deletion.java
│   ├── array_updating.java
│   ├── array_reversing.java
│   └── array_merging.java
│
├── 03_searching/
│   ├── linear_search.java
│   └── binary_search.java
│
├── 04_sorting/
│   ├── bubble_sort.java
│   ├── selection_sort.java
│   ├── insertion_sort.java
│   ├── merge_sort.java
│   └── quick_sort.java
│
├── 05_two_dimensional_array/
│   ├── matrix_addition.java
│   ├── matrix_subtraction.java
│   ├── matrix_multiplication.java
│   ├── matrix_transpose.java
│   └── matrix_diagonal_sum.java
│
└── 06_practice_programs/
    ├── largest_element.java
    ├── smallest_element.java
    ├── second_largest.java
    ├── duplicate_elements.java
    ├── palindrome_array.java
    ├── reverse_array.java
    ├── majority_element.java
    ├── maximum_subarray_sum.java
    └── kadane_algorithm.java
```

---

# 🎯 7. Important Array Problems

Practice these problems to improve your programming logic.

### 🟢 Beginner Level

1. Print all elements of an array.
2. Find the sum of array elements.
3. Find the largest and smallest elements.
4. Calculate the average of array elements.
5. Reverse an array.
6. Count even and odd elements.
7. Copy one array into another.

### 🔵 Intermediate Level

1. Find the second-largest element.
2. Find duplicate elements.
3. Remove duplicate elements.
4. Search an element using linear search.
5. Search an element using binary search.
6. Sort an array using bubble sort.
7. Merge two arrays.
8. Find the missing number in an array.

### 🔴 Advanced Level

1. Find the majority element.
2. Find the maximum subarray sum.
3. Implement Kadane's Algorithm.
4. Find the pair with a given sum.
5. Find the maximum product subarray.
6. Rotate an array by K positions.
7. Find the trapped rainwater.
8. Find the best time to buy and sell stock.

---

# 📊 8. Important Array Concepts

| Concept            | Description                                                             |
| ------------------ | ----------------------------------------------------------------------- |
| Index              | Position of an element in an array.                                     |
| Length             | Number of elements in an array.                                         |
| Traversal          | Visiting each element.                                                  |
| Subarray           | A contiguous part of an array.                                          |
| Subsequence        | Elements selected while maintaining relative order.                     |
| Two Pointers       | Technique using two indices to solve problems.                          |
| Sliding Window     | Technique for solving problems involving continuous portions of arrays. |
| Kadane's Algorithm | Algorithm to find the maximum sum subarray.                             |

---

# 🏆 9. Learning Outcomes

After completing this topic, I aim to understand:

* 📌 Array declaration and initialization.
* 📌 One-dimensional and multidimensional arrays.
* 📌 Array traversal and manipulation.
* 📌 Searching and sorting algorithms.
* 📌 Matrix operations.
* 📌 Two-pointer technique.
* 📌 Sliding window technique.
* 📌 Kadane's Algorithm.
* 📌 Problem-solving using arrays.

---

# 🛠️ 10. Technologies Used

| Technology      | Purpose              |
| --------------- | -------------------- |
| ☕ Java          | Programming Language |
| 💻 VS Code      | Code Editor          |
| 🔧 JDK          | Java Development Kit |
| 🐙 Git & GitHub | Version Control      |

---

# 📈 11. Learning Progress

| Topic             |     Status    |
| ----------------- | :-----------: |
| Array Basics      |  🟢 Learning  |
| Array Operations  | 🟡 Practicing |
| Searching         | 🟡 Practicing |
| Sorting           | 🟡 Practicing |
| 2D Arrays         | 🟡 Practicing |
| Advanced Problems |  🔴 Upcoming  |

*Progress will be updated as I complete each topic.*

---

<div align="center">

## 🌟 Practice More | Think Better | Code Smarter

**Developed & Maintained by Uday Kumar**

![Made with Java](https://img.shields.io/badge/Made%20With-Java-orange?style=flat-square\&logo=java)

</div>
