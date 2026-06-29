import java.util.Arrays;

class PlushOneArr{
    public static void main(String[] args) {
        System.out.println("plus one");
              int a[] ={9,9};
        //int a[] = {1, 2, 3, 4};

        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] == 9) {
                a[i] = 0;
            } else {
                a[i] = a[i] + 1;
                break;   // 🔥 stop after increment
            }
        }

        //System.out.println(Arrays.toString(a));
        int rev[]= new int [a.length +1];
        rev[0]=1;
        System.out.println(Arrays.toString(rev));
    }
}