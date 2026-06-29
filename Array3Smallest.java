public class Array3Smallest {
    public static void main(String[] args) {
        int[][] array3 = {
            {12, 7, 15},
            {3,  22, 9}
        };

        int smallest = array3[0][0];
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {
                if (array3[i][j] < smallest) {
                    smallest = array3[i][j];
                }
            }
        }
        System.out.println("Smallest value in array3: " + smallest);
    }
}
