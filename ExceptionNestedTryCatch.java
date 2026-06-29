
                                                     //Nested try-catch

class ExceptionNestedTryCatch{
    public static void main(String[]args){
        try{
            try{
                int a=10/0;
            }
            catch(ArithmeticException e){
                System.out.println("ArithmeticException :"+ e.getMessage());
            }
            try{
                String Course = null;
                System.out.println("Length"+ Course.length());
            }
            catch(NullPointerException e){
                System.out.println("NullPointerException :"+ e.toString());
            }
            try{
                String Name="Bisanjeet Mahapatra";
                System.out.println(Name.charAt(50));
            }
            catch(StringIndexOutOfBoundsException e){
                System.out.println("StringIndexOutOfBoundsException :"+ e.toString());
            }
        }
        catch(Exception e){
                System.out.println("Exception :"+ e.getStackTrace());
                e.printStackTrace();
            }
    }
}