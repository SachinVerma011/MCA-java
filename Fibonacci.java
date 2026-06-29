import java.util. Scanner;
class Fibonacci{
    public static void main (String[]args){
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the value : ");
         int n = kb.nextInt();
         int firstnum=0;
         int secondnum=1;
         int nextturm ;
         for(int i=1; i<=n; i++)
         {
            System.out.print(firstnum + " , ");
            nextturm = firstnum + secondnum;
            firstnum = secondnum;
            secondnum = nextturm;
            
         }
         
    }
}