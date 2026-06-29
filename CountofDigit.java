import java.util.*;

class CountofDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter the value : ");
        int n = sc.nextInt();
       

        int count = 0; // ✅ declare variable

        while (n != 0) {
            n /= 10;
            count++;
            System.out.print(  count);
        }
    }
}