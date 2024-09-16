import java.util.Scanner;

class InputNumbers {
    private int[] inputArr;

    // Method to take user input
    public int[] getInput() {
        Scanner scanner = new Scanner(System.in);
        inputArr = new int[5];
        while (true) {
            try {
                for (int i = 0; i < 5; i++) {
                    System.out.print("Enter number " + (i + 1) + ": ");
                    inputArr[i] = scanner.nextInt();
                }
                break;
            } catch (Exception e) {
                System.out.println("Enter a valid number.");
                scanner.next(); // Clear invalid input
            }
        }
        scanner.close();
        return inputArr;
    }
}