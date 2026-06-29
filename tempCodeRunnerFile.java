
//using backtraking 

import java.util.*;
class StringPermutation{
    public static void main (String[]args){
        String str ="ABC";
        permutation(S.toCharArray(),0);

    }
    static void permutation(char a[], int fi){
        if(fi== a.length-1){
            System.out.println(String .valueOf(a));

            return;
        }
        for(int i=fi; i<a.length; i++){
            swap(a,fi,i);
            permutation(a, fi*1);
        }
    }
    static void swap(char a[] ,int start, int end){
        char temp = a[start];
        a[start] = a[end];
    }
}