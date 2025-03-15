# Java-Full-Theory
This repository contains fundamental Java programs, structured into various topics, to help beginners understand core Java concepts.

## 🛠 Prerequisites
- IntelliJ IDEA installed
- JDK 17+ installed

## 🚀 How to Run the Project
1. Clone the repository.
2. Open the project in IntelliJ IDEA.
3. Set up the JDK in IntelliJ.
4. Run any Java file from the `src/basics` folder.

## 📌 Java Concepts Covered

### 🔹 Basics
- **HelloWorld.java** - Introduction to Java and printing output.
- **CommandLineArguments.java** - Handling command-line arguments.
- **SingleAndMultiLineComments.java** - Using comments in Java.
- **VariablesInJava.java** - Understanding variables and data types.
- **TypeCasting.java** - Implicit and explicit type conversion.
- **ArithmeticOperators.java** - Performing arithmetic operations.
- **RelationalOperators.java** - Understanding relational comparisons.
- **LogicalOperators.java** - Working with logical operators.

### 🔹 Control Structures
- **IFStatement.java** - Demonstrating if conditions in Java.
- **SwitchStatement.java** - Understanding switch cases.
- **NestedIfExample.java** - Using nested if conditions effectively.

### 🔹 Loops
- **WhileLoop.java / ForLoop.java** - Different loop structures in Java.
- **FibonacciSeries.java** - Generating Fibonacci sequences.
- **PrimeNumberCheck.java** - Checking if a number is prime.

### 🔹 Arrays
- **ArrayExample.java** - Introduction to arrays.
- **FindDuplicateInArray.java** - Detecting duplicates in arrays.
- **TwoDArrayExample.java** - Working with 2D arrays.

### 🔹 Strings
- **StringExample.java** - Basics of string handling in Java.
- **ReverseString.java** - Reversing a string programmatically.

### 🔹 Methods
- **TypesOfMethods.java** - Exploring different method types.
- **ReturningArraysFromMethod.java** - Returning arrays from methods.

### 🔹 Object-Oriented Programming (OOP)
- **ClassAndObject.java** - Understanding classes and objects.
- **ConstructorExample.java** - Exploring constructors in Java.
- **MethodOverloading.java** - Demonstrating method overloading.
- **SingleInheritance.java** - Implementing single inheritance.
- **InterfaceExample.java** - Using interfaces in Java.

### 🔹 GUI Development
- **AWTExample.java** - Introduction to AWT components.
- **DatabaseOperationWithAWT.java** - Performing CRUD operations with AWT.

### 🔹 Database Operations
- **CRUDOperationsWithMySQL.java** - Connecting Java with MySQL.
- **MySQLJDBCConnection.java** - Using JDBC for database interaction.

## 📜 License
This project is open-source under the MIT License.

## 📬 Contact
For queries or contributions, reach out via:
- **Email:** mailto:
- **LinkedIn:** https://www.linkedin.com/in/
- **GitHub:** https://github.com/  

### ..............................................................................................................................

## JAVA Full Theory - Short Notes

### 🔹 1_HelloWorld.java
The **HelloWorld.java** program is the simplest Java application that introduces the basic structure of a Java program. It contains a class, a `main` method, and a print statement.

This program uses `System.out.println` to display text on the console, making it the first step in understanding Java syntax and execution. It helps beginners get familiar with how Java programs are written and run.

### .....................................................

### 🔹2_CommandLineArguments.java
The **CommandLineArguments.java** program demonstrates how to pass and handle command-line arguments in Java. Command-line arguments are values provided when executing the program from the terminal or command prompt.

This program takes arguments as an array (`args[]`), iterates through them using a loop, and prints each argument to the console. It is useful for handling user inputs without requiring interactive input during runtime.

### .....................................................

### 🔹3_SingleAndMultiLineComments.java
This program demonstrates how to use single-line and multi-line comments in Java.

- **Single-line comments** are used to comment out a single line of code. They begin with `//` and everything after `//` on that line is treated as a comment.  
  In the example, `// THIS IS SINGLE LINE COMMENTS` is a single-line comment.

- **Multi-line comments** are used to comment out multiple lines of code. They begin with `/*` and end with `*/`.  
  In the example, `/* THIS PART IS ALLOCATED FOR MULTI LINE COMMENTS */` is a multi-line comment that can span multiple lines.

### .....................................................

### 🔹4_VariablesInJava.java
This program demonstrates the use of different types of variables in Java.

#### 🔹 Variable Types Used:
- **String** → Stores text values (e.g., `"Dilakshan"`).
- **int** → Stores integer values (e.g., `25`).
- **float** → Stores decimal values (e.g., `25.25f`).
- **char** → Stores a single character (e.g., `'M'`).
- **boolean** → Stores `true` or `false` values (e.g., `true`).

#### 🔹 Program Functionality:
- Declares and initializes different types of variables.
- Prints the values of these variables to the console using `System.out.println()`.

This program helps understand how different data types are used in Java for storing and handling information.

### .....................................................
### 🔹5_TypeCasting.java

This program demonstrates **Type Casting** in Java, which is the process of converting one data type into another.

#### 🔹 Types of Type Casting:

1. **Widening Casting (Automatic Type Conversion)**
  - Converts a smaller data type into a larger one automatically.
  - Order: `byte -> short -> char -> int -> long -> float -> double`
  - Example: Converting an `int` to a `double`.

2. **Narrowing Casting (Explicit Type Conversion)**
  - Converts a larger data type into a smaller one manually using type casting.
  - Order: `double -> float -> long -> int -> char -> short -> byte`
  - Example: Converting a `double` to an `int`.

#### 🔹 Program Functionality:
- Demonstrates **widening casting** by converting an `int` to a `double`.
- Demonstrates **narrowing casting** by converting a `double` to an `int`.
- Prints the original and converted values to the console.

This program helps in understanding how type conversion works in Java and when to use explicit or implicit casting.  

### .....................................................
### 🔹6_ArithmeticOperators.java

This program demonstrates the use of **arithmetic operators** in Java. Arithmetic operators are used to perform mathematical operations on numeric values.

#### 🔹 Arithmetic Operators Used:
1. **Addition (`+`)** → Adds two numbers.
2. **Subtraction (`-`)** → Subtracts one number from another.
3. **Multiplication (`*`)** → Multiplies two numbers.
4. **Division (`/`)** → Divides one number by another (quotient).
5. **Modulus (`%`)** → Returns the remainder of division.

#### 🔹 Program Functionality:
- Declares and initializes two integer variables.
- Performs arithmetic operations using these operators.
- Prints the results to the console.

This program helps understand basic mathematical operations in Java and how to apply them in real-world scenarios.  

### .....................................................

### 🔹7_ArithmeticAssignmentOperators.java
This program demonstrates the use of **arithmetic assignment operators** in Java. These operators perform arithmetic operations and assign the result to the variable in a single step.

#### 🔹 Arithmetic Assignment Operators Used:
1. **Addition Assignment (`+=`)** → Adds a value to the variable (`a += 10` is equivalent to `a = a + 10`).
2. **Subtraction Assignment (`-=`)** → Subtracts a value from the variable (`a -= 10` is equivalent to `a = a - 10`).
3. **Multiplication Assignment (`*=`)** → Multiplies the variable by a value (`a *= 10` is equivalent to `a = a * 10`).
4. **Division Assignment (`/=`)** → Divides the variable by a value (`a /= 10` is equivalent to `a = a / 10`).
5. **Modulus Assignment (`%=`)** → Finds the remainder and assigns it (`a %= 10` is equivalent to `a = a % 10`).

#### 🔹 Program Functionality:
- Declares and initializes an integer variable.
- Performs arithmetic assignment operations on the variable.
- Prints the updated value after each operation.

This program helps understand how assignment operators simplify arithmetic calculations in Java.  

### .....................................................
### 🔹8_RelationalOperators.java

This program demonstrates the use of **relational operators** in Java. Relational operators are used to compare values and return a boolean result (`true` or `false`).

#### 🔹 Relational Operators Used:
1. **Equal to (`==`)** → Checks if two values are equal.
2. **Not equal to (`!=`)** → Checks if two values are not equal.
3. **Less than (`<`)** → Checks if the first value is smaller than the second.
4. **Greater than (`>`)** → Checks if the first value is larger than the second.
5. **Less than or equal to (`<=`)** → Checks if the first value is smaller than or equal to the second.
6. **Greater than or equal to (`>=`)** → Checks if the first value is larger than or equal to the second.

#### 🔹 Program Functionality:
- Declares and initializes two integer variables.
- Compares these values using relational operators.
- Prints the boolean results (`true` or `false`) for each comparison.

This program helps in understanding how relational operators work and their importance in decision-making (e.g., `if` conditions) in Java.  

### .....................................................
### 🔹9_LogicalOperators.java

This program demonstrates the use of **logical operators** in Java. Logical operators are used to combine multiple conditions and return a boolean result (`true` or `false`).

#### 🔹 Logical Operators Used:
1. **Logical AND (`&&`)** → Returns `true` if **both** conditions are true.
  - Example: `(m1 >= 35 && m2 >= 35)` → Checks if both `m1` and `m2` are greater than or equal to 35.
2. **Logical OR (`||`)** → Returns `true` if **at least one** condition is true.
  - Example: `(m1 >= 35 || m2 >= 35)` → Checks if either `m1` or `m2` is greater than or equal to 35.

#### 🔹 Program Functionality:
- Declares and initializes two integer variables.
- Uses logical operators to evaluate conditions based on given values.
- Prints the boolean results (`true` or `false`) for each logical operation.

This program helps in understanding how logical operators work and how they are used in **decision-making** (e.g., `if` conditions) in Java.  

### .....................................................
### 🔹10_ConditionalOperators.java

This program demonstrates the use of the **conditional (ternary) operator** in Java. The ternary operator is a shorthand for `if-else` statements and is used to make quick decisions based on a condition.

### .....................................................