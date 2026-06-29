public class Sum2drow {
    public static void main(String[] args) {
  
        int[][] arr = {
            {1, 8, 3},
            {4, 25, 6},
            {7, 88, 9}
        };
int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            System.out.println("Sum of row " + i + " = " + sum);
        }
    }
}