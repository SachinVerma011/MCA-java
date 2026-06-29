import java.util.Scanner;
 class AddUpToDigit {
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int sum =0;

        for(int i=0; i<=n; i++)
        {
            sum=sum+i;
        }
        System.out.println("Number "  + n + " : "+ sum);
    }
}
