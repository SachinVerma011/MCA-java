import java.util.*;
class LastDigitFact{
    public static void main(String[]args){
        int n = 5;
        int fact =1;
        int a;
        for(int i = 1; i<=n; i++){
            fact = fact *i;
           
        }
         a = fact/10; 
        System.out.println(a);
        
    }
}