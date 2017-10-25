# For-Each Loops
## 1D Arrays
```
//assuming scores is a 1D Array
for(int i = 0; i < scores.length; i++){
  int s = scores[i];
  sum += s;
}
```
---
```
int[] scores = {...};
int sum = 0;
for(int s: scores){
  sum+=s;
}
```
## 2D Arrays
```
for(int r = 0; r < scores.length; r++){
  for(int c = 0; c < scores[0].length; c++){
    int s = scores[r][c];
    sum += s;
  }
}
```
---
```
int sum = 0;
for(int[] num : scores){
  for(int s:num){
    sum+=s;
  }
}
```
## General Notes
- You cannot add or remove elements within a for-each loop
  - if you want to add onto an array, subtract from an array etc, use a traditional for loop
- You cannot change values of elements within a for-each
