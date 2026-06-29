// 145 = 1!+4!+5! = 1+24+120 =145

import java.util. Scanner;
class Strong
{
    public static void main (String[]args)
    {
        int d,sum=0;
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the value : ");
         int n = kb.nextInt();
         int num =n;
         while(n>0){
             int fact=1;
              d=n%10;
              for (int i=1; i<=d; i++)
              {
                fact= fact*i;
              }
              sum=sum+fact;
              n=n/10;
         }
         
         if(num==sum)
         {
            System.out.println("strong Number ");
         }
         else
         {
            System.out.println("Not  strong number ");
         }
    }
}