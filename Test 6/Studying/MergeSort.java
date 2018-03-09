public void sort(int arr[], int l, int r)
    {
        if (l < r)
        {
            // Find the middle point
            int m = (l+r)/2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr , m+1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

void mergesort(int[] arr, int start, int end){
  if(start<end){
    int middle = (start+end)/2;

    mergesort(arr, start, middle);
    mergesort(arr, middle+1, end);

    merge(arr, start, middle, end);
}
