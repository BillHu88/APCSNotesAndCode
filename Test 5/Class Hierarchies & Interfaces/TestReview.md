# Review Questions
## What is an abstract class?
- A class that contains one or more abstract methods
- A class that has methods that are declared but not defined
## Why is it better to use an abstract method than an empty method?
- Compiler ensures that your concrete class deines the abstract methods
- This helps you so that you don't accidentally forget to override it
- Other classes cant inherit the methods
## What is a concrete class?
- A class that has no abstract methods
- All methods are defined
## What is the main difference between an abstract class and an interface?
- An interface doesn't have fields, non-concrete methods, or constructors, while abstract classes can have both of those
## Can a class implement several interfaces?
- Yes
## Suppose you declare a variable of an interface type. What kind value can be assigned to that variable?
- An object of any class that implements the interface 