class Parent {
    Parent() {
        System.out.println("Parent constructor called.");
    }
}

class Child extends Parent {
    Child() {
        //super(); // Explicitly calls Parent's constructor
        System.out.println("Child constructor called.");
    }
}

public class ConstructorUsingSuperK {
    public static void main(String[] args) {
        Child obj = new Child(); // Creates a Child object
    }
}