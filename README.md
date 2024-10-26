# java-learning
Java notes and programs topics wise


VARIABLES 
Variables are the data containers that save the data values during Java program execution. Every Variable in Java is assigned a data type that designates the type and quantity of value it can hold. 
A variable is a memory location name for the data.

Types of variables:
1. Instance variables
  - Variables are declared inside a class outside any method or block or a constructor.
  - We can access the instance variables in 2 ways -- by using identifier name & by using classs object / class Instance
  - For instance variables JVM will utomatically initialized them with their default values of datatypes
  - If instance variables & local variables are having same name then the 1st priority will be given to the Local variables
  - For every instance a seperate copy of instance variables will be create (How many objects we are creating insid a class those many copies of instance variables will be created) 

2. Static variables
  - variables which are declared inside a class, outside any method or a block or constuctor and with the help of Static keyword
  - Satatic variables will be initialized at the time of class loading
  - We can access static variables in 3 ways -- By using identifier name, by uisng class object, by using class ClassName
  - For static variables the JVM will automatically initialize them with other default values of datatypes
  - If static variable name and local variable name both are same, then the first priority will be given to local variables.
  - A static variable can never be a Local variable
  - There will be only one copey of static variable available throughout the program.

3. Local variables
  - Variables which are decalred inside a method or a block or a constuctor are known as local variables
  - WE can access a local variable only with the help of its identifier name.
  - The scope of a local variable is only within the method (means we cannot access a local variable outside the method)
  - for local variable the JVM will not assign any default valeus. It is the programmer responsiblity to initialize them.
  - If we are declaring local variables & if we are not using that variable then our program will be executed normally. Bust if we are using the Local variable without initialization we will get compile time error. 



DATA TYPES
1. Primitive Data types: 
  - built-in data types --> Numeric, character, boolean
  - Numeric ---> int, long, byte (default = 0), short, float, double  (default = 0.0)
  - Char ---> char 
  - Boolean ---> boolean (default = false)


2. Non-primitive data types: 
   User-defined data types----> String, Array, abstract, class, Enum


TYPE CASTING
The process of converting one data type into another data type except boolean, is called Type Casting. When you assign a value from one primitive data type to another type, this is known as type casting. To enable the use of a variable in a specific manner, this method requires explicitly instructing the Java compiler to treat a variable of one data type as a variable of another data type.

Two types:
1. Implicit type casting:
  - converts smaller datatypes to larger data types
  - Called as widening
  - Implicit type casting is done by the compiler automatically
  - There is no scope of loosing information

    byte ---> short ---> char ---> int ---> long ---> float ---> double  (From left to right: Lower data type to Higher data type)


2. Explicit type casting:
  - converts Large data type to smaller data types
  - Called as Narrowing
  - Explicit typecasting will be done by the programmer manually.
  - There may be a chance of loosing information.

    double ---> float ---> long ---> int ---> char ---> short ---> byte  (From left to right: Higher data type to Lower data type)

ACCESS MODIFIERS
  - Public => Classes, methods, or data members that are declared as public are accessible from everywhere in the program. no restriction on the scope of public data 
    members. The public access modifier has the widest scope among all other access modifiers. The public access modifier is specified using the keyword public.
  
  - Private => The methods or data members declared as private are accessible only within the class in which they are declared. Any other class of the same package will 
    not be able to access these members. The private access modifier is specified using the keyword private. private means “only visible within the enclosing class”. These 
    modifiers in terms of application to classes, apply only to nested classes and not on top-level classes.
  
  - Protected => The methods or data members declared as protected are accessible within the same package or subclasses in different packages. The protected access 
    modifier is specified using the keyword protected.
  
  - Package - private(default package) => When no access modifier is specified for a class, method, or data member – It is said to be having the default access modifier by   default. The data members, classes, or     
    methods that are not declared using any access modifiers i.e. having default access modifiers are accessible only within the     
    same package.

CONSTRUCTORS:
- A constructor in Java Programming is a block of code that initializes (constructs) the state and value during object creation.
- Constructor is a Method used to initialize objects that are called when an object of the class is created  
- It is called every time an object with the help of a new () keyword is created.
- Constructor name should be same as class name
- Constructor will not be having any return type
- We need to initialize a class object with the available constuctors present in out proogram.
- In a java program if we are not writing ant constuctor ie., either parameterized or non-parameterized constructor then the java compiler provides default constructor.
- Default constuctor is exactly same like non-parameterized constructor
- The access modifier fot the default constructor provided by the compiler will be same as the access modifier of the class.
- If the class is public then constuctor is also public. If the class is private, then constructor is also private.
- If we declare a constructor as private, then we can restrict creating an object of our class in other classes
- Just like void methods, we can write a return statement inside a constructor without returning anyting.
- Constructor over loading is possible but overriding is not possible.

**JAVA DESIGN PATTERNS:**
- A design pattern is a reusable solution for common problems in software design used in engineering.
- It is not a full design ready for coding but rather a guideline or model for solving issues.
- Design patterns can be adapted to different situations and contexts, providing flexibility in problem-solving.

Types of Design Patterns:
1. Creational Design Patterns in Java:
- Creational Design Patterns are a category of Design Patterns that focuses on process of Creating objects.
- The aim is to enhance the flexibility and efficiency in Object creation. It allows the systems to remain independent of how their objects are constructed, composed and represented.
- Helps to streamline the object creation and can lead to more maintainable and adaptable code.

Singleton pattern, Factory Design Pattern, Abstract Factory pattern, Builder Pattern, Prototype Pattern.

* Factory Design Pattern ---> The Factory Method Design Pattern is a creational design pattern used in software development. It provides an interface for creating objects in a superclass and allowing subclasses to specify the types of objects they create.
(check with the code for better understanding)

  -> When do we use Factory Design Pattern?
    --If your object creation process is complex or varies under different conditions, using a factory method can make your client code simpler and promote reusability.
    --The Factory Method Pattern allows you to create objects through an interface or abstract class, hiding the details of concrete implementations. This reduces dependencies and makes it easier to modify or expand 
      the system without affecting existing code.
    --If your application needs to create different versions of a product or may introduce new types in the future, the Factory Method Pattern provides a flexible way to handle these variations by defining specific 
      factory methods for each product type.
    --Factories can also encapsulate configuration logic, allowing clients to customize the object creation process by providing parameters or options to the factory method.
  

* Builder Design Patterns:
  -- Builder pattern builds a complex object using simple objects and using a step-by-step approach.
  -- This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.
  -- A Builder class builds the final object step by step. This builder is independent of other objects.


* Singleton Design Pattern:
  -- Ensures that a class has only 1 instance and provides global access to that instance. 
  -- "One man's constant is another man's variable"

* Abstract Facotry Pattern:
  -- Provides an interface for creating families of related / dependent objects without specifying concrete classes



2. Behavioral Design Pattern: Specifically concerned with communication between objects.

*Strategy Design Pattern: Defines a family of algorithms, encapsulates each one and makes them interchangeable. STrategy lets the algorithm very independently from clients that use it.
Based on 3 rules: 
  Favour composition(has-a relation) over Inheritance (is-a relation) ---> RULE 1
  Always code to interfaces / abstract classes. Do not code to concrete classes to achieve loose coupling in the implementation of Dynamic Polymorphism. ---> RULE 2
  Code must be open for extension and must be closed for modification ---> RULE 3


    


