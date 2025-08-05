# ElevateLabsJava
Java Console Calculator
Description
This is a simple Java console-based calculator that supports addition, subtraction, multiplication, and division. It demonstrates core programming concepts including methods, conditionals, loops, input/output, and basic error handling (e.g., divide-by-zero). The program repeatedly shows a menu, accepts the user's choice and operands, performs the calculation, and displays the result until the user chooses to exit.

Features
Addition, subtraction, multiplication, division via dedicated methods.
Safe user input parsing.
Division-by-zero detection with user-friendly error message.
Menu loop allowing multiple calculations in one run.
Exit option to terminate cleanly.
Requirements
Java Development Kit (JDK) 17 or later installed.
Terminal / Command Prompt.
(Optional) VS Code or IntelliJ IDEA for editing.
Setup & Running

Compile
Open terminal in the directory containing Calculator.java and run:
javac Calculator.java

Run
After successful compilation:
bash
Copy
Edit
java Calculator

Usage
Choose an operation from the menu by entering its number or symbol.
Enter the two numbers when prompted.

View the result.

Repeat or choose exit to quit.

Example Interaction
sql
Copy
Edit

=== Java Console Calculator ===
Select operation:

Addition (+)
Subtraction (-)
Multiplication (*)
Division (/)
Exit
Enter choice (1-5): 1
Enter first number: 5
Enter second number: 3
Result: 8.0
Notes
If division by zero is attempted, the program will display an error instead of crashing.
Input is validated; non-numeric entries prompt for re-entry.
