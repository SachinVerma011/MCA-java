import java.util. Scanner;
class Marksheet
{

    public static void main(String[]args)
    {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the value");
        int mark = num.nextInt();
        if(mark >= 90){
            System.out.println("Grade A");
        }
        else if(mark >= 80){
            System.out.println("Grade B ");
        }
         
         else if(mark >= 70){
            System.out.println("Grade C");
        }
        else if(mark >= 60){
            System.out.println("Grade D");
        }
        else if(mark >= 50){
            System.out.println("Grade E");
        }
        else {
            System.out.println(" Fail ");
        }
    }
}