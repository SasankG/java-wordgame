# JAVA
-  Java is a high level language that needs to be COMPILED by a COMPILER program
    - Compiler: takes the java text and converts into a JAVA FILE
    - Compilers make Java run on any platform (via Java Virtual Machine which finds what platform it is currently running on)
        - Thus Java is a language AND a platform
    - Example: Say uou have 2 java files with a funciton each
        - The compiler complies all the files and creates .class files
            - The JVM takes the class files (on the RAM) and converts .class -> bytes -> native code on the platform
- JAVA IS VERY SYNTAX PICKY
- Make sure to ALWAYS ASSIGN DATA TYPES WHEN DECLARING SOMETHING

# Downloading Java
- The JDK and SE need to be downloaded from oracle

# Starting Java
- To run a java file it needs to be COMPILED first, * javac * command will compile the file
    - javac text.java
- It can then be run using * java * command
    - java text 
- You will notice that after you run javac a .class file will be created
    - The .class file is useless for the programmer, it is there as binary for the JVM


# Notes
- In Java every application NEEDS to start with a CLASS -> public class myclass
    - THE CLASS NAME HAS TO BE THE SAME AS THE FILE NAME (basically the application name and the file name have to be the same)

# Classes
- Classes should start with a capital letter as per convention 
- Classes are OBJECTS that define the DATA TYPE and methods used
    - Classes are basically objects that act as blueprints or templates
- Thus Java is OBJECT - ORIENTED
- CLASSES ARE LIKE CONSTRUCTOR FUNCTIONS IN JS
    - e.g public class Dog {
            String breed;
            int age;
            String color;

            void barking() {
            }

            void hungry() {
            }

            void sleeping() {
            }
        }
        - JAVA HAS ITS OWN CONSTRUCTOR FUNCTIONS AS WELL

- main(): every program must contain a main() method, the main() will alwayys be run.

# Variables
- VARS MUST BE TYPE DECLARED AND GIVEN A VALUE IN JAVA
    - e.g int count = 20
- The values can be assigned later as long as the type and name are declared
- VARIABLES MUST HAVE UNIQUE NAMES
- STRINGS MUST USE DOUBLE QUOTES "", SINGLE QUOTES DO NOT WORK
- ALL LINES MUST END IN A ; OR THE PROGRAM WILL NOT COMPILE
- StringBuilder vars are Strings that can be modified

# General methods
- .indexOf() will find the first occurrance of the argument 
- .concate() can be used to concatenate, or can use + operator
- if/else are same as JS
- Switch/case same as JS
- For/While loops same as JS
    - Java has For-each loops
        - String[] cars = {"etc"}
        for (String i : cars){
            System.out.println(i)
        }
        - Prints the whole array
## Math Methods
- Math.max(x,y) will find higher number between x and y
- Math.min(x,y) finds the min between x and y
- .sqrt(), .abs(), .random(), etc

## Arrays
- Arrays are written -> String[] myArray = {}
- Arrays must be written in {} curly braces and like all vars in JAva must be given a type
- If you want to print the entire array you need to use a for loop
    - println without a for loop will return: [Ljava.lang.String;@4aa8f0b4
    - for (String i : wordList){
            System.out.println(i);
        }
- 2D arrays can be made -> int[][] myNum = {{2,3,4,} , {6,7,8,}}

## Try and Catch
- Similar to JS with different syntax
- try {
      int[] myNumbers = {1, 2, 3};
      System.out.println(myNumbers[10]);
    } catch (Exception e) {
      System.out.println("Something went wrong.");
    } finally {
        System.out.println("The 'try catch' is finished.");
    }
    - Exception e: is the Java version of error
    - finally: runs when the try and catch is finsihed regardless of result

## Throw
- Java also has throw for Exceptions (java version of errors)
- There are many kinds of Exceptions e.g ArithmeticExceptions, ClassNotFOundException,SecurityException etc. 

## METHODS AND FUNCTIONS
- Apart from predfined functions java can make its own like js
- e.g: static void myFunction(){}
    - STATIC: Means that the function belongs to the CLASS its in
    - VOID: means it has NO RETURN VALUE
        - Void can be replaced with a dta type if you want to return something
- Functions are called just like in JS -> myMethod();
- The arguments for the functions need to have TYPES DECLARED

## Packages and Objects
- Java comes with alot of basic packages that can be imported
- e.g java.util.Scanner takes user input, util.Arrays has Arrayy methods.

## CLASSES AND OBJECTS
- The main focus of Java
- Classes are like constructor functions from js
    - Start with public/private class myClass{}
- Objects can take class datafrom the class they belong too
    - MyClass myobj = new MyClass()
