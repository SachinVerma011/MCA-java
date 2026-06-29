
import java.util.Scanner;
class Sumuser {
    public static void main(String[] args) {
        System.out.print("enter the number  :");
        Scanner kb = new Scanner(System.in);
        int n =kb.nextInt();
       int sum=0;
       int arr[]=new int[n];
      
      
        for( int i=0; i<n; i++){
            arr[i] = kb.nextInt();
            sum+=arr[i];
            
        }
       System.out.println("sum " +sum); 
       /*for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("\nSum of elements: " + sum);*/
    }
}