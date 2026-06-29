public class SmallestArray {
  public static void main(String[] args) {
  int cars[]  = {1,2,3,4,5,0};
  int size =6;
  int smallest = Integer.MAX_VALUE;
  for(int i=0; i<size; i++)
  if(cars[i]<smallest){
  smallest=cars[i];
  }
    System.out.println("smallest : "+smallest);
  }
}
