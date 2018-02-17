# Recursion
## Goals of this Unit
- Learn about recursion
- Learn to interpret & write recursive methods
## Properties of Algorithms
- Compactness
    - an algorithm can use iterations or recursionto repeat the same steps multiple times
- Generality
    - the same algorithm applies to any "size" of task or any input values
- Abstractness
    - an algorithm does not depend on a particular computer language or platform (although it may depend on the general computing model)
## Recursive Methods
- A recursive solution describes a procedure for a particular task in terms of applying *the same* procedure to a similar but smaller task.
- You must have a *base case*, or cases that don't need recursion
- 1<sup>2</sup>+2<sup>2</sup>+...+n<sup>2</sup>
- if n is simply 1: then return 1(base case)
- n>1: calculate the sum of 1<sup>2</sup>+2<sup>2</sup>+...+(n-1)<sup>2</sup> then add n<sup>2</sup>
````
//Precondition: n>=1
public static int addSquares(int n){
    if(n==1) //base case
        return 1;
    else
        return addSquares(n-1)+n*n;
}
````
- recursion is based on the mathematical concept that the definition of a function can use itself
- f(n)=n! (n-factorial)
    - f(n){1, if n=1//f(n-1)*n, if n>1}
```
//Precondition: n>=1
public static int factorial(int n){
    if(n=1)
        return 1;
    else
        return factorial(n-1)*n;
}
```
## Practice Tracing
```
public String someFun(String s){
    if(s.length()>=2)
        s = someFun(s.substring(1))+s.charAt(0);
    return s;
}
```