import java.util.Scanner;

public class Array3Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = 2, cols = 3;
        int[][] array3 = new int[rows][cols];

        System.out.println("Enter elements for 2x3 array3:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                array3[i][j] = sc.nextInt();
            }
        }

        System.out.println("Array elements entered successfully.");
        sc.close();
    }
}
