
class Student{
   void  StuName(){
        System.out.println("Sohan");  
       }
    }
    class Course extends Student{
       void CourseInfo(){
           System.out.println("MCA25100000"); 
        }
    }
    class StuAddress extends Course{
       void Address(){
            System.out.println("Bhopal ,M.P.");
        }
    }
public class Multilevel7{
    public static void main(String[]agrs){
        StuAddress kb =new StuAddress();
       kb.StuName();
       kb.CourseInfo();
       kb.Address();
    }
    
}
