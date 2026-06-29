import java.util.Scanner;
class Reverce{
    public static void main (String[]args)
    {
       Scanner kb = new Scanner(System.in);

        System.out.println("Enter the Value");
        int n = kb.nextInt();
        int  rev = 0 ;
        int rem;
        while (n>0)
        {
           rem = n % 10;
            rev = rev * 10 +rem;
            n = n/10;
        }
        System.out.println("Reverce Value : "+rev);
    }
}