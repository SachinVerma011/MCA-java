import java.util. Scanner;
class Table{
    public static void main (String[]args){
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the value : ");
         int n = kb.nextInt();
         for(int i=1; i<=10; i++)
         {
            //System.out.println((n*i));
          System.out.println(n + " x " + i + " = " + (n * i));
         }
         
    }
}