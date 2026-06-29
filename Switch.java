import java. util. Scanner;
class Switch{
    public static void main(String[]args){
        Scanner kb = new Scanner(System.in);
        {
        System. out. println("Input date 1 August to 5 August : ");
        }
        int date = kb.nextInt();
        switch(date){

        case 1 :
         {
           System.out.println("Friday");
         }
         break;

         case 2 :
         {
           System.out.println("Saturday");
         }
         break;

         case 3 :
         {
           System.out.println("Sunday");
         }
         break;

         case 4 :
         {
           System.out.println("Monday");
         }
         break;

         case 5 :
         {
           System.out.println("Tuesday");
         }
         break;

          default:
        }
        
    }
}