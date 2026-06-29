class Company{
    String name ;
    int age ;
    double DOB ;
    Company(String name,int age,double DOB ){
           this. name = name;
           this.age = age;
           this.DOB =DOB;
           
        System.out.println("name : "+name+"    Age : "+age+ "    DOB : "+DOB);
    }
    Company (Company copy){
         
         //this. name = copy.name;
          // this.age = copy.age;
          // this.DOB =copy.DOB
           
         this(copy.name,copy.age, copy.DOB);

        System.out.println("Copy constructor");
    }
}
class CopyConstructor{
    public static void main (String []args){
       Company kb = new Company("Sachin",20,10.09);
       Company mb = new Company(kb);
    }
}