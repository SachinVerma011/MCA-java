import java. util. Scanner;
class Calculator{
    public static void main(String[]args){
        Scanner kb = new Scanner(System.in);
        {
        System. out. println("Enter Value : ");
        }
        float a = kb.nextFloat();
        {
         System. out. println("Enter Value : ");
        }
       float b = kb.nextFloat();
       
        System. out. println("Take One Operator +,-,*,/,% : ");
        char Operator = kb.next().charAt(0);

        float Result = 0;

        switch(Operator){
        case '+':
            Result = a + b;
            break;

        case '-':
            Result = a - b;
            break;
        
        case '*':
            Result = a * b;
            break;
        
        case '/':
            Result = a / b;
            break;

        case '%':
            Result = a % b;
            break;

        default:
        }

       System.out.println(a + " " + Operator + " " + b+ " = " + Result);
    }
}