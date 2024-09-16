public class Main {
    public static void main(String[] args) {
        // Instance InputNumbers to get user input
        InputNumbers inputNumbers = new InputNumbers();
        int[] userInput = inputNumbers.getInput();

        // Instance BubbleSort to sort the array
        BubbleSort bubbleSort = new BubbleSort(userInput);
        bubbleSort.sort();
        // Test to assure the original array is retained
        System.out.print("Original array: ");
        for (int num : userInput) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Print the sorted array
        System.out.print("Sorted array: ");
        int[] sortedArr = bubbleSort.getSortedArray();
        for (int num : sortedArr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Instance Product to calculate product of sorted array elements
        Product product = new Product(sortedArr);
        product.getProduct();
        }
}
