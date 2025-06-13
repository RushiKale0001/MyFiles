# 📘 Java Programming Concepts – Basic Overview

> A compact explanation of essential Java concepts based on your sample code.

---

## 🔹 Comments in Java

* **Single-line:** `// comment here`
* **Multi-line:**

  ```java
  /* 
     Multiple lines 
     of comment 
  */
  ```

---

## 🔹 Input/Output Libraries

* `import java.io.*;` – Imports all classes from the `java.io` package.
* `import java.util.Scanner;` – Allows input from users.
* `import java.util.Random;` – For generating random numbers.

---

## 🔹 Output Methods

* `System.out.print()` – Prints text without a new line.
* `System.out.println()` – Prints text followed by a new line.

---

## 🔹 Variables in Java

* A **variable** is a reusable container for data.
* Two main **types**:

  * **Primitive** – Stores actual value (in stack memory)
  * **Reference** – Stores memory address (points to heap memory)

---

## 🔹 Primitive Data Types

| Type      | Description            | Example Value |
| --------- | ---------------------- | ------------- |
| `int`     | Integer numbers        | 21            |
| `float`   | Decimal (suffix `f`)   | 9.78f         |
| `double`  | Decimal (default type) | 15.5          |
| `char`    | Single character       | 'A', '4'      |
| `boolean` | True/False             | true          |

---

## 🔹 Reference Data Types

* **String:** Sequence of characters (e.g., names, text)

---

## 🔹 Variable Declaration

* **Declaration:** Define the variable type and name (`int a;`)
* **Assignment:** Assign a value (`int a = 12;`)

---

## 🔹 Output with Variables

* Concatenate variables in strings using `+` operator.
* Text inside quotes `" "` is treated literally, not as variable.

---

## 🔹 Conditionals

* `if (condition) { ... } else { ... }`
* Boolean values determine flow (e.g., `true` means execute `if` block).

---

## 🔹 Functions/Methods

* **Static Methods:** Called directly from `main()` without creating an object.
* **Non-static Methods:** Require creating an instance of the class.

---

## 🔹 Important Notes

* Decimal values default to `double`. Use `f` for `float`.
* Method definitions within static `main()` must also be `static` unless an object is used.
* Java is **case-sensitive** (`String` ≠ `string`).

