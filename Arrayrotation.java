import java.util.Arrays;

class Arrayrotation {
    public static void main(String[] args) {
        int k = 3;
        int a[] = {1, 2, 3, 4, 5, 6};

        for (int i = 0; i < k; i++) {
            rotate(a);
        }

        System.out.println(Arrays.toString(a));
    }

    static void rotate(int a[]) {
        int temp = a[0];

        for (int i = 1; i < a.length; i++) {
            a[i - 1] = a[i];
        }

        a[a.length - 1] = temp;
    }
}

// Time Complexity = O(n × k)