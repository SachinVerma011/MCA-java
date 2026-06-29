import java.util. Scanner;
class Factorial{
    public static void main (String[]args)
    {
         int fact = 1;
         int i;
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter the value : ");
         int n = kb.nextInt();
        
         for( i=1; i<=n; i++)
         { 
            fact = fact*i;

         }
            System.out.println(" Factorial " + fact); 
         
    }
}