class Exceptionmethod{
    public static void main (String[]args){
        try{
            int arr[]={1,2,3,4,5};
            System.out.println(arr[5]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("getMessage :" + e.getMessage());
            System.out.println("toString :" + e.toString());
            System.out.println("getCause :" + e.getCause());
            System.out.println("getStackTrace :" + e.getStackTrace());
            System.out.println("printStackTrace :" );
            e.printStackTrace();

        }
    }
}