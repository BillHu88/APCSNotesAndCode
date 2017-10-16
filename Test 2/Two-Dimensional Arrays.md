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
  - Each row is stored in a seperate block of consecutive memory locations
