//neon num = 9=9*9= 81 = 8+1=9

import java.util.Scanner;
class NeonNum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println(" Enter the  number ");
        int r =sc.nextInt();
        //int r = 9;
        int s=r;
        int sq=r*r;
        int sum = 0;
        while(sq>0){
            sum = sum +sq%10;
            sq=sq/10;
            
        }
        if (s==sum){
            System.out.println("neon number");
        }
        else{
            System.out.println("not neon number");
        }
        
    }
}