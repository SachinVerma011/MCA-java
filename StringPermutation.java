
//backtraking

import java.util.*;

class StringPermutation {
    public static void main(String[] args) {
        String str = "ABC";
        permutation(str.toCharArray(), 0);
    }

    static void permutation(char a[], int fi) {
        if (fi == a.length - 1) {
            System.out.println(Arrays.toString(a));
            return;
        }

        for (int i = fi; i < a.length; i++) {
            swap(a, fi, i);
            permutation(a, fi + 1);
            swap(a, fi, i); // backtracking
        }
    }

    static void swap(char a[], int start, int end) {
        char temp = a[start];
        a[start] = a[end];
        a[end] = temp;
    }
}