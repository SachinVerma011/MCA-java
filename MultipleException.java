class MultipleException{
    public static void main(String[] args){
        try{
            int a=10;
            int b=0;
            int c=a/b;
           
           int arr[]={1,2,3,4,5,6};{
            System.out.println(arr[7]);
           }
        }
        /*catch( ArrayIndexOutOfBoundsException | ArithmeticException e){
            System.out.println("ArrayIndexOutOfBoundsException | AirthmethicException" + e.getMessage());
        }*/
       catch( ArrayIndexOutOfBoundsException e){
        System.out.println("ArrayIndexOutOfBoundsException :" + e.toString());
       }
       catch(ArithmeticException e){
        System.out.println("ArithmeticException: " + e.getMessage());
       }
    }
}