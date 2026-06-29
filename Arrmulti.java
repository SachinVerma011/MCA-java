class Arrmulti{

 public static void main(String[]args) {
 int multi = 1;
int[] arr={1,3,4,4,2};
 for(int i= 0; i<arr.length; i++){

 multi*=arr[i];
}
 System.out.println("Array Multiplication : "+multi);
 
}
}