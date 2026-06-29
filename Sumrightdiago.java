class Sumrightdiago{
 
  public static void main(String[]args){
  
  int arr[] []= {  {1,2,9},{4,5,6},{7,8,9}};
   
  int sum=0;
 
  for(int i=0; i<arr.length; i++){
    
  sum+=arr[i][arr.length - 1 - i];

  }
  
  System.out.println("Sum of right diagonal : " +sum);
  
  }
  }