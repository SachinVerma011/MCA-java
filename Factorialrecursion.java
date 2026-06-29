
import java.util.Scanner;
class Factorialrecursion {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("enter the number : ");
        int n=kb.nextInt();
      int fact=1;
     for(int i=1;i<=n; i++){
         fact=fact*i;
     }
    
        System.out.println("Factorial of "+n+" : "+fact );     
        }
       
    
}