///single inheritence
/*  
class Java {
    Java(){
        System.out.println("Java is good");
    }
}
class Python extends Java{
    Python(){
        System.out.println("Python is good");
    }
}
class Main {
    public static void main (String[]args){
        Java kb= new Python();
    }
}
*/
// multilevel
/*
class Java {
    void Java1() {
        System.out.println("Java is good");
    }
}

class Python extends Java {
    void Python1() {
        System.out.println("Python is good");
    }
}

class Main {
    public static void main(String[] args) {
        Java k = new Java();
        k.Java1();

        Python k1 = new Python();
        k1.Python1();
    }
}
*/

//hierarchical inheritence
/*
class Java {
    void Java1() {
        System.out.println("Java is good");
    }
}

class Python extends Java {
    void Python1() {
        System.out.println("Python is good");
    }
}
class C extends Java {
    void C1() {
        System.out.println("C is good");
    }
}

class Main {
    public static void main(String[] args) {
        Java k = new Java();
        k.Java1();

        Python k1 = new Python();
        k1.Python1();

         C k2 = new C();
        k2.C1();
    }
}
*/

//multiple inheritence

interface  Java {
    default void Java1() {
        System.out.println("Java is good");
    }
}

interface  Python {
    default void Python1() {
        System.out.println("Python is good");
    }
}
class Language implements Java, Python {
    Language() {
        System.out.println("C is good");
    }
}

class Main {
    public static void main(String[] args) {
        Language k = new Language();
        k.Java1();
        k.Python1();

    }
}
