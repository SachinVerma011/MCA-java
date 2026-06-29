public class Sum1d{
   public static void main (String[]Args) {
   int[]array = {5,20,25,30};
    int sum = 0;

    for(int i=0; i < array.length; i++){
     
    sum = sum + array[i];
     
    }
    System.out.println("Sum"+sum);
   } 
  }