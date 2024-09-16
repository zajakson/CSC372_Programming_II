class BubbleSort {
    private int[] originalArr;
    private int[] arr;

    // Constructor accepting the original array
    public BubbleSort(int[] originalArr) {
        this.originalArr = originalArr;
        // Making a deep copy of the original array
        this.arr = originalArr.clone();
    }

    // The bubble sort method
    public void sort() {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    // Getter to retrieve the sorted array
    public int[] getSortedArray() {
        return arr;
    }
}