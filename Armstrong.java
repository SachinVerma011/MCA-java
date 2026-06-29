// 153 = 1*1*1+5*5*5+3*3*3 = 1+125+27 =153

import java.util. Scanner;
class Armstrong
{
    public static void main (String[]args)
    {
        int c, rem,arm=0;
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the value : ");
         int n = kb.nextInt();
         c =n;
         while(n>0){
              rem=n%10;
              arm=(rem*rem*rem)+arm;
              n=n/10;
         }
         
         if(c==arm)
         {
            System.out.println("Armstrong Number ");
         }
         else
         {
            System.out.println("Not  Armstrong number ");
         }
    }
}