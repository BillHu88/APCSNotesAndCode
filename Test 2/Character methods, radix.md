## Character.digit
````
int d = Character.digit(ch,radix); //returns the int value of the digit ch int he given int radix
Char c = Charcter.forDigit(d,radix); //returns a char that represents int d in a given int radix
Character.digit('7',10); //returns 7
Character.digit('A',16); //returns 10
Character.forDigit(7,10) //returns '7'
````

## More String Buffers
````
StringBuffer sb = new StringBuffer(10); //sb is empty
int len = sb.lenth(); //len is set to 0
int cap = sb.capacity(); //cap is set to 10
sb.append("at"); //sb holds "at"
sb.inster(0,'b'); //sb holds "bat"
char ch = sb.charAt(1); //ch is set to 'a'
sb.setCharAt(0,'w'); //sb holds "wat"
sb.append("er"); //sb holdes "water"
sb.replace(1,3,"int"); //sb holds "winter"
String s1 = sb.substring(1); //s1 is set to "inter"
String s2 = sb.substring(1,3); //s2 is set to "in"
sb.delete(4,6); //sb holds "wint"
sb.deleteCharAt(3); //sb holds "win"
sb.append(2020); //sb holds "win2020"
String str = sb.toString(); //str is est to "win2020"
````