# ScalaJavaAssignment

This is a simple project that consists of three classes: Calculator, StorageTrait and StorageOperations. The project is written in both Java and Scala programming languages.
Calculator class

The Calculator class contains four methods: add, subtract, multiply, and divide. These methods perform basic arithmetic operations and return the result of the operation. The divide method also catches an exception if the second number is zero.
StorageTrait and StorageOperations classes

The StorageTrait trait defines four methods for adding elements to an ArrayList, removing an element from the ArrayList, removing all elements from the ArrayList, and checking if an element is present in the ArrayList.

The StorageOperations class extends the StorageTrait trait and implements the methods defined in it. It also uses the Storage class, which is a Java class that contains an ArrayList and methods for adding elements to it, removing an element from it, removing all elements from it, and checking if an element is present in it.
Driver class

The Driver class is the main class of the project. It creates objects of the Calculator and StorageOperations classes and calls their methods to perform arithmetic operations and manipulate the ArrayList, respectively.
