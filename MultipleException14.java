class MultipleException14{
    public static void main(String[] args){
        try{
           int a=10/0;
           
           int arr[]={1,2,3,4,5,6};{
            System.out.println(arr[7]);
           }
        }
       catch( ArrayIndexOutOfBoundsException e){
        System.out.println("ArrayIndexOutOfBoundsException :" + e.toString());
       }
       catch(ArithmeticException e){
        System.out.println("ArithmeticException: " + e.getMessage());
       }
    }
}