import java.util.Scanner;
class ArrUserInput{
    public static void main (String[]args){
        Scanner kb = new Scanner(System.in);
        System.out.println("enter element");
        int n =kb.nextInt();
        int [] arr= new int[5];
        for(int i=0; i<arr.length; i++){
            arr [i]=kb.nextInt();
        }
         System.out.println("Array Element");
        for(int i=0; i<arr.length; i++){
           System.out.print( arr [i]+" ");
        }
    }
}