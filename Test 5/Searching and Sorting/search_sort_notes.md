# Searching and Sorting
## Sequential Search
- Scans the list comparing the target value to each element
```
public int sequentialSearch(Object[] arr, Object target){
    for(int i = 0l i<arr.length; i++){
        if(target.equals(arr[i]))
            return i;
    }
    return -1;
}
```
- The average number of comparisons (assuming the target value is equal to one of the elements of the array, randomly chosen) is about <i>n/2</i> (where n=arr.length)
- Worst case: <b>n</b> comparisons.
- Also <b>n</b> comparisons are needed to establish that the target value is not in the array 
- We say that this is an O(n) (order of n) algorithm.
## Binary Search
- The elements of the list must be arranged in ascending (or descending) order.
- The target value is always compared with the middle element of the remaining search range.
- We must have random access to the elements of the list (an array or ArrayList are OK)
- sometimes called "divide and conquer" algorithms
<br>
<b>Recursive impimentation</b>:
```
public int binarySearch(int[] arr, int value, int left, int right){
    if(right<left)
        return -1; //not found

    int middle = (left+right)/2;

    if(value==arr[middle])
        return middle;
    
    else if(value<arr[middle])
        return binarySearch(arr, value, left, middle-1);
    else // if (value>arr[middle])
        return binarySearch(arr, value, middle+1, right);
}
```
<b>Iterative impimentation</b>:
```
public int binarySearch(int[] arr, int value, int left, int right){
    while(left<=right){
        int middle = (left+right)+2;

        if(value==arr[middle])
            return middle;
        else if (value<arr[middle])
            right = middle -1;
        else // if (value>arr[middle])
            left = middle + 1;
    }
    return -1; //Not found
}
```