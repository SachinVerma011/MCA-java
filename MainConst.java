class Const{
 String name;
 int age ;
 String course;
   Const(){
   System.out.println("default constractor");
   }
   Const (String nm){
   this.name=nm;
   this.age=21;
    this.course=nm;
     System.out.println("Name"+name+  "Age"+age+  "course"+course);
    }
    }
    public class MainConst {
     public static void main (String[]args){
    Const kb=new Const();
   Const kb1=new Const("Sachin", "MCA");
    } 
   }