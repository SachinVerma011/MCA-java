import java.util.Scanner;
class Evenorodd{
    public static void main (String[]args){

       Scanner Evenorodd = new Scanner(System.in);

       System.out.println("Enter the value");
       int num = Evenorodd.nextInt();
       if(num%2==0){
        System.out.println("Even Number");
       }
       else{
        System.out.println("odd Number");
       }
    }
}