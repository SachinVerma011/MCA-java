// 121
import java.util. Scanner;
class Polindrom
{
    public static void main (String[]args)
    {
        int c, r,s=0;
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the value : ");
         int n = kb.nextInt();
         c =n;
         while(n>0){
              r=n%10;
              s=(s*10)+r;
              n=n/10;
         }
         
         if(c==s)
         {
            System.out.println("Polindrom Number ");
         }
         else
         {
            System.out.println("Not Polindrom number ");
         }
    }
}