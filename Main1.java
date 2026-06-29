public class Main1 {

    public static void checkNumber(int num) {
        if (num < 0) {
            // Using throw to manually throw an exception
            throw new ArithmeticException("Number cannot be negative!");
        }

        System.out.println("Valid number: " + num);
    }

    public static void main(String[] args) {
        System.out.println("Program started...");

        // Calling method with a negative number to trigger throw
        checkNumber(-5);

        System.out.println("Program ended.");
    }
}
