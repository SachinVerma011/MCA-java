public class Array3FirstRow {
    public static void main(String[] args) {
        int[][] array3 = {
            {12, 7, 15},
            {3,  22, 9}
        };

        System.out.print("First row elements: ");
        for (int j = 0; j < array3[0].length; j++) {
            System.out.print(array3[0][j] + " ");
        }
        System.out.println();
    }
}
