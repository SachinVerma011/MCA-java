import java.util.Scanner;
 class Square {
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int sum =n*n;
        System.out.println("Number "  + n + " : "+ sum);
    }
}
