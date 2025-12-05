# Sample Java File Reader and Writer

This repository is designed for **Introduction to Java Programming students** to learn fundamental concepts including:
- File I/O (FileReader and FileWriter)
- Arrays
- Loops
- Methods

## Overview

This project contains two Java programs that demonstrate file handling operations while incorporating essential programming concepts like arrays, loops, and methods.

## Files

### 1. fileWrite.java
A program that collects user input and writes it to a file using structured methods and arrays.

**Key Concepts Demonstrated:**
- **Arrays**: Uses `String[]` arrays to store prompts, labels, and user responses
- **Loops**:
  - `for` loop to iterate through prompts and collect input
  - `for` loop to write multiple data entries to file
- **Methods**:
  - `getUserInput()` - Collects input from user using an array of prompts
  - `writeToFile()` - Writes array data to a file
  - `displayMessage()` - Displays status messages
- **File Writing**: Uses `FileWriter` to save data to `example.txt`

**What it does:**
1. Prompts user for 5 pieces of information (name, favorite food, year, hobby, color)
2. Stores responses in an array
3. Writes all data to a file with proper labels
4. Demonstrates organized code structure with separate methods

### 2. fileRead.java
A program that reads data from a file, stores it in an array, and displays it with additional statistics.

**Key Concepts Demonstrated:**
- **Arrays**: Uses `String[]` array to store file lines after reading
- **Loops**:
  - `while` loop to read all lines from file
  - `for` loop to display numbered lines
  - Enhanced `for-each` loop to search through array
- **Methods**:
  - `readFileToArray()` - Reads file content and returns it as a String array
  - `displayLines()` - Displays array contents with formatting
  - `countLinesContaining()` - Searches array for specific keywords
- **File Reading**: Uses `BufferedReader` and `FileReader` to read from `example.txt`
- **ArrayList**: Demonstrates converting between ArrayList and array

**What it does:**
1. Reads all lines from `example.txt` into an array
2. Displays each line with numbering
3. Shows statistics (total lines, keyword counts)
4. Demonstrates data processing after reading

## How to Use

### Running the Write Program
```bash
javac fileWrite.java
java fileWrite
```
Follow the prompts to enter your information. Data will be saved to `example.txt`.

### Running the Read Program
```bash
javac fileRead.java
java fileRead
```
This will display the contents of `example.txt` along with statistics.

## Learning Objectives

By studying this code, students will learn:

1. **File I/O Operations**
   - How to write data to files using FileWriter
   - How to read data from files using FileReader and BufferedReader
   - Proper resource management (closing files)

2. **Arrays**
   - Declaring and initializing arrays
   - Accessing array elements using indices
   - Working with array length property
   - Converting between ArrayList and arrays

3. **Loops**
   - `for` loops with counter variables
   - `while` loops for conditional iteration
   - Enhanced `for-each` loops for array traversal

4. **Methods**
   - Creating reusable methods with parameters
   - Returning values from methods
   - Method organization and code structure
   - Exception handling with `throws` clause

5. **Best Practices**
   - Code organization and modularity
   - Meaningful variable and method names
   - Error handling with try-catch blocks
   - Comments and code documentation

## Program Flow

```
fileWrite.java Flow:
User Input → Array Storage → Method Processing → File Writing → Success Message

fileRead.java Flow:
File Reading → Array Storage → Data Processing → Display Output → Statistics
```

## Error Handling

Both programs include try-catch blocks to handle `IOException` gracefully, demonstrating proper exception handling for file operations.

## Requirements

- Java Development Kit (JDK) 8 or higher
- Basic understanding of Java syntax
- Text editor or IDE (VS Code, IntelliJ, Eclipse, etc.)

## Practice Exercises

Try modifying the code to:
1. Add more questions to the fileWrite program
2. Implement a search feature in fileRead to find specific information
3. Create a method to sort the array of lines alphabetically
4. Add validation to ensure user input is not empty
5. Create a method to count total words in the file

## Author

Created as an educational resource for Introduction to Java Programming students.
