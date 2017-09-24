# String Methods
## Basics
- `length()` -> returns num of char in String
	- `"Flower".length();` -> 6
- `1charAt()` -> returns the kth char
	- character position in the string starts at 0
	- `"Wind".charAt(2);` -> 'n'

## Substrings
- `String s1=s.substring(i,j);` -> returns the substring of the chars in positoins from `i` to `j-1`
	- `i` is inclusive
	- `j` is exclusive
	- `"strawberry".substring(2,5);` -> "raw"
	- `"unhappy",substring(2);` -> "happy"
	- `"emptiness".substring(9);` -> "" (empty string)
- `String s2=s.substring(i);` -> returns String from i-th char to the end
- Substrings are an example of an "overloaded" method
	- and overloaded method is a method that has the same name but can do two different things
- Example:
	- `str.substring(i,str.length());` is the same as `str.substring(i)`

## Concatenation
- `String result = s1+s2;`
	- concatenatoin of s1 & s2
- `String result = s1.concat(s2);`
	- the same thing
- `result += s3;`
- `result += num` (`num` is an `int`)
	- converts num to a string then concatenates num to result

## IndexOf
````
String date = "Feb 18, 2001 8:52:28 AM";
date.indexOf('F'); //0
date.indexOf('2'); //8
date.indexOf("2001"); //8

date.indexOf("2",9); //16, 9 is the pos where we start searching
date.indexOf('2'); //18
````

- There are four overloaded versions of `indexOf`:
	- `indexOf(char);`
	- `indexOf(string);`
	- `indexOf(char, int);`
	- `indexOf(string, int);`

## Comparisons
- `boolean b = s1.equals(s2);` -> returns true if the String s1 equals s2
- `boolean b = s1.equalsIgnoreCase(s2);` -> returns true if the String s1 equals s2 (case blind)
- `int diff = s1.compareTo(s2);`
- `int diff = s1.compareToIgnoreCase(s2);`

#### CompareTo
- compares two strings lexicographically
- comparison is based on the Unicode value of each char in the string
- the result is negative if the String object is smaller than the argument
- the result is positive if the String object is bigger than the argument
- the result is 0 if the object equals the argument
- if the `String` object and `arg` havve a different chars at one or more indices
	- `k` be the smallest index
	- then the string whose char at position k has the smaller value, lexicographically precedes the other String

## Replacements
- `String s2=s1.trim();`
	- returns a new string formed from s1 by removing whitespace at both ends
- `String s2=s1.replace(oldCh,newCh);`
	- returns a new string formed from s1 by replacing all occurences `oldCh` with `newCh`
- `String s2=s1.toUpperCase();` // `String s2=s1.toLowerCase()`
	- returns a new string formed from s1 by converting its characters to upper (lower) case

## Numbers to Strings
- `String a = "" + n;`
- `String s=Integer.toString(n);` (`n` is an int)
- `String s=Double.toString(x);` (`x` is a double)
- `String s=String.valueOf(n);`

#### Decimals to Strings
````
import java.text.DecimalFormat;
....
DecimalFormat money = new DecimalFormat("0.00");
double amt = 56.7381;
String s = money.format(amt);
````

S-->56.74
