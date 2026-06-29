class UnderAgeException extends Exception{
    UnderAgeException(){
        super("You are under age");
    }
     UnderAgeException(String message){
        super(message);
    }
}
class UserException15{
    public static void main(String[]agrs){
        int age =17;
        try{
                if(age<18){
                    throw new UnderAgeException();
                }
                else{
                    System.out.println("You can Vote now");
                }
           }
        catch(UnderAgeException e){
          System.out.println( e.getMessage());
         }
    }
}