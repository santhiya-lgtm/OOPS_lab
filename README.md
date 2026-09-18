# OOP JAVA LAB 

A collection of Java Object-Oriented Programming laboratory experiments for **Batch I**.  
The repository contains programs covering classes and objects, inheritance, abstract classes, ADT, exception handling, wrapper classes, multithreading, inter-thread communication, ArrayList, file handling, and JavaFX/JDBC CRUD operations.

\---

## Repository Structure

```text
OOP\_JAVA\_BATCH\_I/
├── .gitignore
├── README.md
├── Ex\_1\_Electricity\_Bill/
│   └── ElectricityBill.java
├── Ex\_2\_Converter/
│   └── Converter.java
├── Ex\_3\_Employee\_Inheritance/
│   └── Main.java
├── Ex\_4\_Abstract\_Shape/
│   └── Main.java
├── Ex\_5\_ADT\_Stack\_Exception/
│   └── Main.java
├── Ex\_6\_Wrapper\_Autoboxing/
│   └── WrapperClassDemo.java
├── Ex\_7\_Multithreading/
│   └── MultiThreadDemo.java
├── Ex\_8\_Inter\_Thread\_Communication/
│   └── InterThreadCommunication.java
├── Ex\_9\_ArrayList\_String\_Operations/
│   └── ArrayListExample.java
├── Ex\_10\_File\_Handling/
│   └── Demo.java
└── Ex\_11\_JavaFX\_JDBC\_CRUD/
    ├── StudentManagementApp.java
    └── database\_setup.sql
```

\---

## Experiments Index

|Exp No.|Topic|Core Concepts|Primary Class / Files|
|-|-|-|-|
|**Ex 1**|Electricity Bill Calculator|Classes, Objects, Methods, Conditional Statements|`ElectricityBill.java`|
|**Ex 2**|Currency, Distance \& Time Converter|Scanner, Switch Case, Unit Conversion|`Converter.java`|
|**Ex 3**|Employee Inheritance \& Pay Slip|Inheritance, Constructors, Method Reuse|`Main.java`|
|**Ex 4**|Abstract Shape Class|Abstract Classes, Abstract Methods, Inheritance|`Main.java`|
|**Ex 5**|Stack ADT Using Exception Handling|Interface, Stack, Array, Exception Handling|`Main.java`|
|**Ex 6**|Wrapper Classes \& Autoboxing|Wrapper Classes, Autoboxing, Unboxing, Parsing|`WrapperClassDemo.java`|
|**Ex 7**|Multithread Program|Thread Creation, `run()`, `start()`|`MultiThreadDemo.java`|
|**Ex 8**|Inter-Thread Communication|`synchronized`, `wait()`, `notifyAll()`|`InterThreadCommunication.java`|
|**Ex 9**|String Operations Using ArrayList|ArrayList, Add, Remove, Search, Filtering|`ArrayListExample.java`|
|**Ex 10**|File Handling|`File` Class, File Properties, Path Operations|`Demo.java`|
|**Ex 11**|JavaFX \& JDBC CRUD Application|JavaFX, JDBC, MySQL, CRUD|`StudentManagementApp.java`, `database\_setup.sql`|

\---

## Detailed Experiment Specifications

### Experiment 1: Electricity Bill Calculator

* **Directory:** `Ex\_1\_Electricity\_Bill/`
* **Main Class:** `ElectricityBill`
* **Concepts:** Classes, Objects, Instance Variables, Methods, Conditional Statements.
* **Description:** Accepts consumer details, previous and current meter readings, and connection type. It calculates the consumed units and electricity bill using different tariff slabs for Domestic and Commercial connections.
* **Source:** The supplied program calculates units as current reading minus previous reading and applies separate slab rates for Domestic and Commercial connections. fileciteturn0file3L8-L42
* **Compilation \& Execution:**

```bash
cd Ex\_1\_Electricity\_Bill
javac ElectricityBill.java
java ElectricityBill
```

\---

### Experiment 2: Currency, Distance \& Time Converter

* **Directory:** `Ex\_2\_Converter/`
* **Main Class:** `Converter`
* **Concepts:** `Scanner`, `switch-case`, Arithmetic Operations, Unit Conversion.
* **Description:** A menu-driven converter supporting Dollar to INR, Euro to INR, Yen to INR, Meter to KM, KM to Meter, Hours to Minutes, and Minutes to Seconds. fileciteturn0file2L2-L18
* **Compilation \& Execution:**

```bash
cd Ex\_2\_Converter
javac Converter.java
java Converter
```

\---

### Experiment 3: Employee Inheritance \& Pay Slip

* **Directory:** `Ex\_3\_Employee\_Inheritance/`
* **Main Class:** `Main`
* **Concepts:** Inheritance, Constructors, `super`, Method Reuse, Salary Calculation.
* **Description:** Uses a base `Employee` class and derived classes for Programmer, Assistant Professor, Associate Professor, and Professor. Each designation generates a pay slip using the inherited employee details and salary calculations. fileciteturn0file4L2-L16
* **Compilation \& Execution:**

```bash
cd Ex\_3\_Employee\_Inheritance
javac Main.java
java Main
```

\---

### Experiment 4: Abstract Shape Class

* **Directory:** `Ex\_4\_Abstract\_Shape/`
* **Main Class:** `Main`
* **Concepts:** Abstract Class, Abstract Method, Inheritance, Method Implementation.
* **Description:** Defines an abstract `Shape` class with `printArea()`. Rectangle, Triangle, and Circle classes implement the area calculation in their own way. fileciteturn0file4L200-L228
* **Compilation \& Execution:**

```bash
cd Ex\_4\_Abstract\_Shape
javac Main.java
java Main
```

\---

### Experiment 5: Stack ADT Using Exception Handling

* **Directory:** `Ex\_5\_ADT\_Stack\_Exception/`
* **Main Class:** `Main`
* **Concepts:** Interface, Abstract Data Type, Array Stack, Exception Handling.
* **Description:** Implements a stack using an array and a `Mystack` interface. The program supports Push, Pop, Display, and Exit operations and handles stack overflow and underflow conditions. fileciteturn0file5L2-L15
* **Compilation \& Execution:**

```bash
cd Ex\_5\_ADT\_Stack\_Exception
javac Main.java
java Main
```

\---

### Experiment 6: Wrapper Classes \& Autoboxing

* **Directory:** `Ex\_6\_Wrapper\_Autoboxing/`
* **Main Class:** `WrapperClassDemo`
* **Concepts:** Wrapper Classes, Autoboxing, Unboxing, String Parsing.
* **Description:** Demonstrates conversion between primitive data types and wrapper objects. It also demonstrates parsing values from strings using methods such as `Integer.parseInt()` and `Float.parseFloat()`. fileciteturn0file5L122-L164
* **Compilation \& Execution:**

```bash
cd Ex\_6\_Wrapper\_Autoboxing
javac WrapperClassDemo.java
java WrapperClassDemo
```

\---

### Experiment 7: Multithreading

* **Directory:** `Ex\_7\_Multithreading/`
* **Main Class:** `MultiThreadDemo`
* **Concepts:** Threads, `extends Thread`, `run()`, `start()`.
* **Description:** Generates a random number in a separate thread. If the number is even, a square thread is started; if it is odd, a cube thread is started. fileciteturn0file6L2-L15
* **Compilation \& Execution:**

```bash
cd Ex\_7\_Multithreading
javac MultiThreadDemo.java
java MultiThreadDemo
```

\---

### Experiment 8: Inter-Thread Communication

* **Directory:** `Ex\_8\_Inter\_Thread\_Communication/`
* **Main Class:** `InterThreadCommunication`
* **Concepts:** Inter-Thread Communication, Synchronization, `wait()`, `notifyAll()`.
* **Description:** Implements a Producer-Consumer style program using a shared resource. The producer produces values and the consumer consumes them while synchronization controls access to the shared resource. fileciteturn0file7L4-L27
* **Compilation \& Execution:**

```bash
cd Ex\_8\_Inter\_Thread\_Communication
javac InterThreadCommunication.java
java InterThreadCommunication
```

\---

### Experiment 9: String Operations Using ArrayList

* **Directory:** `Ex\_9\_ArrayList\_String\_Operations/`
* **Main Class:** `ArrayListExample`
* **Concepts:** `ArrayList`, Adding Elements, Removing Elements, Searching, String Filtering.
* **Description:** Demonstrates adding individual elements and collections, inserting elements at specific indexes, searching with `contains()`, removing elements, and displaying strings beginning with a specified letter. fileciteturn0file8L5-L45
* **Compilation \& Execution:**

```bash
cd Ex\_9\_ArrayList\_String\_Operations
javac ArrayListExample.java
java ArrayListExample
```

\---

### Experiment 10: File Handling

* **Directory:** `Ex\_10\_File\_Handling/`
* **Main Class:** `Demo`
* **Concepts:** `java.io.File`, File Properties, Path Handling, File/Directory Checking.
* **Description:** Accepts a path and displays information such as file name, path, absolute path, parent, existence, file/directory status, readability, writability, hidden status, last modified time, and file size. fileciteturn0file9L2-L25
* **Compilation \& Execution:**

```bash
cd Ex\_10\_File\_Handling
javac Demo.java
java Demo
```

\---

### Experiment 11: JavaFX \& JDBC CRUD Application

* **Directory:** `Ex\_11\_JavaFX\_JDBC\_CRUD/`
* **Main Class:** `StudentManagementApp`
* **Concepts:** JavaFX GUI, JDBC, MySQL, CRUD Operations.
* **Description:** Provides a Student Management application with Create, Display, Update, and Delete operations. The supplied program connects to a MySQL `studentdb` database and uses a `students` table containing ID, name, age, and course fields. fileciteturn0file1L2-L10
* **Application Operations:**

  * **Create** — Insert a new student.
  * **Display** — Display student records.
  * **Update** — Update student information using ID.
  * **Delete** — Delete a student using ID.
* **Database Setup:**

```sql
CREATE DATABASE studentdb;
USE studentdb;

CREATE TABLE students (
    id INT AUTO\_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    age INT NOT NULL,
    course VARCHAR(100) NOT NULL
);
```

The supplied experiment also uses MySQL JDBC connectivity and JavaFX controls for the application interface. fileciteturn0file1L22-L37

* **Dependencies:**

  * JDK
  * JavaFX SDK
  * MySQL Server
  * MySQL Connector/J
* **Execution:**

```bash
cd Ex\_11\_JavaFX\_JDBC\_CRUD
```

Configure the JavaFX SDK and MySQL Connector/J paths for your system, then compile and run `StudentManagementApp.java`.

The original experiment documentation demonstrates JavaFX compilation with `--module-path` and the required JavaFX modules, followed by execution with the MySQL Connector/J JAR on the classpath. fileciteturn0file1L180-L187

\---

## System Requirements

* **JDK:** JDK 17 or later recommended.
* **IDE / Terminal:** VS Code, IntelliJ IDEA, Eclipse, PowerShell, Command Prompt, or Bash.
* **JavaFX:** Required for Experiment 11.
* **MySQL Server:** Required for Experiment 11.
* **MySQL Connector/J:** Required for JDBC connectivity in Experiment 11.

\---

## Experiment Coverage

|Area|Experiments|
|-|-|
|Classes \& Objects|Ex 1|
|Scanner \& Switch Case|Ex 2|
|Inheritance|Ex 3|
|Abstract Classes|Ex 4|
|ADT \& Exception Handling|Ex 5|
|Wrapper Classes \& Autoboxing|Ex 6|
|Multithreading|Ex 7|
|Inter-Thread Communication|Ex 8|
|ArrayList \& String Operations|Ex 9|
|File Handling|Ex 10|
|JavaFX, JDBC \& CRUD|Ex 11|

\---

## Verification

The repository is organized experiment-wise so that each program can be compiled and executed independently. The experiment files supplied for Batch I include programs and sample outputs for the listed experiments, including the JavaFX/JDBC CRUD application and its database operations. fileciteturn0file1L188-L197

\---

## 

