class Main2{
    static void swap(int a,int b){
        System.out.println("before swap");
          System.out.println("before swap"+a);  
          System.out.println("before swap"+b);
          
          //int temp =a;
          //a=b;
         // b=temp;
         
          //a=a^b;
           //b=a^b;
           // a=a^b;
           
           a=a+b;
           b=a-b;
           a=a-b;
           
          System.out.println("after swap");
          System.out.println("after swap"+a);  
          System.out.println("after swap"+b);
        }
        
}
class SwappingThreemethod{
    public static void main(String[] args) {
        Main2 kb= new Main2();
        int a=10;
        int b=3;
        kb.swap(a,b);
    }
}