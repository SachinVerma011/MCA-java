class ArrayProductItself {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4};
        int n = a.length;

        int left[] = new int[n];
        int right[] = new int[n];
        int result[] = new int[n];

        // Left array
        left[0] = 1;
        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] * a[i - 1];
        }

        // Right array
        right[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] * a[i + 1];
        }

        // Result array
        for (int i = 0; i < n; i++) {
            result[i] = left[i] * right[i];
        }

        // Print result
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}