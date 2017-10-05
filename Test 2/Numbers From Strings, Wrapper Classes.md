## Numbers from Strings
ex.

````
String s1 = "-123", s2="123.45";
int n = Integer.parseInt(s1); //n= -123
double x = Double parseDouble(s2); //123.45
````

| Primitive Data Type | Wrapper Class |
|---------------------|---------------|
| int                 | Integer       |
| double              | Double        |
| char                | Character     |

`Number format exception`

````
int n;
do{
	try{
		n=Integer.parseInt(s);
	}
	catch(NumberFormatException ex){
		System.out.println("Invalid input, reenter");
	}
} while(...);
````

## Character Methods
- `java.lang.Character`
	- is a "wrapper" class that represents characters as objects
- Methods
	- `Charcater.isDigit(ch);`
	- `Character.isLetter(ch);`
	- `Character.isUpperCase(ch);`
	- `Character.isLowerCase(ch);`
	- `Character.isWhiteSpace(ch);`
		- whitespace is a space, tab, newline, etc.

ex.

````
char ch2 = Character.toUpperCase(ch1);
	"			"   .toLowerCase(ch1);
int  d = Character.digit(ch,radix); //Not tested on the AP Exam
char ch = Character.forDigit(d,radix); //Not tested on the AP Exam
````

## StringBuffer Class
- StringBuffer not tested on the AP, but it is very useful, especially for the free responses
- Represents a string of characters as a mutable object
- Constructors:
	- `StringBuffer() //empty StringBuffer of default capacity`
	- `StringBuffer(n) //empty StringBuffer of given capactiy`
	- `StringgBuffer(str) //converts string into StringBuffer`
- Adds Methods:
	- `setCharAt`
	- `insert`
	- `append`
	- `delete`
- `toString` method converts StringBuffer into a String

##Recap/Review
- `"length".length();` - works only because length has the "" around it, which makes it a literal string
- `String city = "San Francisco";` value of `city.charAt(13)` - out of bounds, value of `city.substring(3,9);` - "_Franc"

