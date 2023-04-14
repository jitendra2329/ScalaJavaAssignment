# ScalaJavaAssignment

## Project Description

This project contains a Scala implementation of a simple calculator and a storage system. The calculator can perform basic arithmetic operations like addition, subtraction, multiplication, and division. The storage system allows users to add and remove elements from an ArrayList.
## Calculator

The Calculator class contains methods for performing basic arithmetic operations. The add, subtract, multiply, and divide methods take two integers as inputs and return the result of the corresponding operation.

## Storage System

The Storage class contains methods for adding, removing, and checking elements in an ArrayList. The addElement method adds four integer elements to the ArrayList. The removeElement method removes a specified element from the ArrayList if it is present. The removeAllElement method removes all elements from the ArrayList. The elementContains method checks if a specified element is present in the ArrayList.

The StorageTrait trait defines the interface for the storage system.

## Scala Calculator

The ScalaCalculator class uses the Calculator class to perform arithmetic operations and logs the results using the Scala logging library. The addition, subtraction, multiplication, and division methods take two integers as inputs and return the result of the corresponding operation.

## Storage Operations

The StorageOperations class uses the Storage class to add, remove, and check elements in the ArrayList and logs the results using the Scala logging library. The addElement, removeElement, removeAllElement, and elementContains methods take inputs as integers and perform the corresponding operations on the ArrayList.

## Driver

The Driver object contains a main method that creates instances of the ScalaCalculator and StorageOperations classes and uses them to perform arithmetic operations and add, remove, and check elements in the ArrayList.

## How to run the project

    Clone the repository to your local machine.
    Open the project in your favorite IDE.
    Run the Driver object.

## Requirements

    Java 8 or higher
    Scala 2.12.13 or higher
    sbt 1.5.5 or higher

## Conclusion

This project demonstrates a simple implementation of a calculator and a storage system in Scala. It also showcases the use of logging in Scala to log the results of operations. Feel free to use and modify the code to suit your needs.
