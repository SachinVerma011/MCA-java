public class Sum2dcol{
  public static void main(String args[]){
 
  int[] []arra={
                {1,3,5},
                {2,4,6},
                {0,1,2}
               };
  
 
  int sum =0;
  for(int j=0; j<arra.length; j++){
  
   for(int i=0; i<arra.length; i++)
  {
   sum=sum+arra[i][j];
  }
   System.out.println("Sum column "+j+" : " +sum);
   }
  
  }
   }