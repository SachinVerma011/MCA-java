
class Student {
    String name;
    char gender;
   
    void info(String name,char gender) {
        this.name = name;
        this.gender = gender;
        System.out.println("Student Name: " + name+"Gender"+gender);
    }

 }
    class Student1 extends Student{
    @Override
    void info(String name, char gender) {
        this.name = name;
        this.gender = gender;
        System.out.println("Student Name: " + name + ", Gender: " + gender );
    }
}

class Overriding8 {
    public static void main(String[] args) {
        Student1 kb = new Student1();

        kb.info("Sohan",'M');             
        kb.info("Rohan", 'M');  
    }
}
