import java.util.Scanner;

class Calculator3{
    public static void main (String[]args){
    
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Enter first value : ");
        double a = kb.nextDouble();

        System.out.println("Enter second value : ");
        double b = kb.nextDouble();

        System.out.print("Choose operator +,-,*,%,/ :");
        char operator = kb.next().charAt(0);

        double result=0 ;
        switch(operator)
        {
            case '+':
                result=a+b;
            break ;

            case '-':
                result =a-b;
            break ;

            case '*':
                result = a*b;
            break;
             
            case '/':
                result =a/b;
            break;
            
            case '%':
                result = a % b;
            break ;

            default:
                System.out.println("Invalid operator ");
                return;

        }
        System.out.println("Result: " + a + " " + operator + " " + b + " = " + result);
        kb.close();
    }
}