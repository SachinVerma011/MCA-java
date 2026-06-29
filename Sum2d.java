 class Sum2d {
    public static void main(String[] args) {
               int[][] arr = {
            {1, 5, 3},
            {4, 5, 6},
            {7, 5, 9}
        };

        int totalSum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                totalSum += arr[i][j];
            }
        }

        System.out.println("Total sum = " + totalSum);
    }
}
