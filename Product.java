class Product {
    private int[] userInput;

    // Constructor to accept the sorted array
    public Product(int[] userInput) {
        this.userInput = userInput;
    }

    // Method to calculate and display the product of elements
    public void getProduct() {
        // Initial operation
        int productTwo = userInput[0] * userInput[1];
        System.out.println(userInput[0] + " * " + userInput[1] + " = " + productTwo);
        for (int i = 2; i < userInput.length; i++) {
            System.out.println(productTwo + " * " + userInput[i] + " = " + (productTwo * userInput[i]));
            productTwo *= userInput[i];
        }
    }
}