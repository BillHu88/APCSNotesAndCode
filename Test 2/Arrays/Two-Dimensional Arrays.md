# Two-Dimensional Arrays

## Overview
- 2-D arrays are used to represent tables, matrices, game boards, images, etc.
- An element of a 2-D array is addressed using a pair of indices, "row" and "column"
  - ex.  `board[r][c]='x';`

## Declarations
```
//2-D array of char with 5 rows, 7 cols
char[][] letterGrid = new char[5][7];
//2-D array of Color with 1024 rows, 768 columns
Color[][] image = new Color[1024][768];
//2-D array of double with 2 rows, 3 cols
double[][] sample = {
  {0.0,0.1,0.2},
  {1.0,1.1,1.2}
};

```

## Dimensions
- In Java, a 2-D array is basically a 1-D array of 1-D arrays, its rows
  - Each row is stored in a separate block of consecutive memory locations
- If `m` is a 2-D array
  - then `m[k]` is a 1-D array, the k-th row
  - `m.length` is the number of rows
  - `m[k].length` is the numebr of clumns in k-th row
    - `m[0].length` then you can assume that it will be same to `m[5].length`

## 2-D arrays and Nested Loops
You can traverse through a 2-D array using nested Loops
```
for(int r=0; r<m.length; r++){
  for(int c=0; c,m[0].length; c++){
    //process m[r][c]
  }
}
```

## "Triangular" Loops
print out the Xs in this 2D array-
```
array m -
OOOOO
XOOOO
XXOOO
XXXOO
XXXXO
```
ex:
```
int n = m.length; //5
for(int r = 1; r < n; r++){
  for(int c = 0; c< r; c++){
    double temp = m[r][c]; //m[1][0] -> temp
    m[r][c] = m[c][r]; // m[0][1] -> m[1][0]
    m[c][r] = temp;
  }
}
```
