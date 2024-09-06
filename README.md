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


