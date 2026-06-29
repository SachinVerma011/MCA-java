
class Student {
    String name;
    char gender;
   
    void info(String name) {
        this.name = name;
        System.out.println("Student Name: " + name);
    }

    void info(String name, char gender, String DOB) {
        this.name = name;
        this.gender = gender;
        System.out.println("Student Name: " + name + ", Gender: " + gender + ", DOB: " + DOB);
    }
}

class Overloading6 {
    public static void main(String[] args) {
        Student kb = new Student();

        kb.info("Sohan");             
        kb.info("Rohan", 'M', "10th Sep 1995");  
    }
}
