# Arrays
## Inserting a Value
1) `|1||1||2||3||8||13||_||_|`
    - Shift elements to the right starting from the last one
2) `|1||1||2||3| ->|5|<- |8||13||_|`
    - Insert value in its proper place
3) `|1||1||2||3||5||8||13||_|`

```
//Returns true if inserted successfully, false otherwise
//Run through for sample inputs:
//insert({0.0,0.1,0.2,0.3,0.4,0.5,0.7}, 6, 0.6)
public boolean insert(double[] arr, int count, double value){
    if(count>=arr.length)
        return false
    int k = count-1 //k=5
    while (k >= 0 && arr[k]>value){
        arr[k+1] = arr[k];
        k--;
    }
    arr[k+1]=value;
    return true
}
```
## Summary/Review
1) How do we refer to an array element in Java?
    - 1D: arr[k]
    - 2D: arr[r][c]
2) Index is invalid?
    - `ArrayIndexOutOfBoundsException`
3) How do we refer to the length of an array?
    - 1D: `arr.length`
    - 2D rows: `arr.length`
    - 2D columns: `arr[0].length`
4) Can I resize an array after it has been created?
    - No. Throw away the old array and a new one of a different size