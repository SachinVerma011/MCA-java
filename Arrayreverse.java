
import java.util.*;
class Arrayreverse {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        int i=0; int j=arr.length - 1;
        int temp;
        while(i<j){
            temp =arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
            
        }
        //for(int k=0; k<arr.length;k++){
        //   System.out.print(arr[k]+" "); 
        //}
        System.out.print(Arrays.toString(arr));
        
    }
}