# Arrays
## Overview
- An array is a block of consecutive memory locations that hold the same data type
- Individual locations are called an array's elements
  - Often referring to the value stored at that location
  `|1.39| |1.69| |1.74| |1.45|` - this is an array of doubles
- Rather than naming every individual element in an array, you name only the array
 Specific array elements are referred to by using array's name and the element's number, called the index or subscript
  - `|1.39| |1.69| |1.74| |1.45|`
  - ..c[0].........c[1]......c[2]..........c[3]

## Indices
- Index is written within [ ]
  - ex. `a[k]` where `a` is the name of the array and `k` is the index
- Indices start from 0
  - The first element of an array
    - `a[0]`
  - The nth element
    - `a[n-1]`
- Examples of different types of array indices
    - `a[3]`
    - `a[k]`
    - `a[k-2]`
    - `a[(int)(6*Math.random())]` - 0<=x<6
- Array is declared with a fixed length (unchangeable)
- Java interpreter checks indices and their values at runtime
- If index is negative or greater than array length -1
  - you will get an `ArrayIndexOutOfBoundsException`
- to create an int array - `arr = new int[newSize];`

## Arrays as Objects
- In Java, an array is an object
  - So if the type of an array is `anyType`, then the type of the array object is `anyType`
  - Declaration: `someType[] arrName;`
  - Initialization: `arrName = new SomeType[n];` - where `n` is the length of array

Ex. D&I :
```
int[] scores = new int[10];
private double [] gasPrices = {3.05,3.17,3.59};
String[] words = new String[1000];
String[] cities = {"Atlanta", "Boston", "Cincinnati"};
```
