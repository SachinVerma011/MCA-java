import java.util.Scanner;
class StrongNum4 {
    public static void main (String[]args){
      Scanner kb = new Scanner(System.in);
      System.out.print("Enter the number : ");
      int num = kb.nextInt();
      
      int sum =0;
      int n =num ;
      while(n>0){
        int fact=1;
        int d=n%10;
        for(int i=1; i<=d; i++){
            fact = fact*i;
        }
        sum =sum+fact;
        n=n/10;
      }
      if(sum==num){
        System.out.println(num+ " is Strong number");
      }
      else{
        System.out.println(num+ " is Not Strong number");
      }

    }
}