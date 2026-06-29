
public class ArrayfinduniueNumber {
    public static void main(String[] args) {
   int []arr ={9,1,4,5,6,5,1,4,6};
        //int 
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++){
            
                if(arr[i]==arr[j])
                {
                   arr[i]=-1;
                   arr[j]=-1;
                }
                
            }
        }
        int ans=-1;
       for(int i=0; i<arr.length; i++){
           if(arr[i]>0){
               ans=arr[i];
           }
       }
       System.out.println("this is the uniue number ~:~ "+ans);
    } 
}
