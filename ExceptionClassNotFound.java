public class ExceptionClassNotFound {
    public static void main(String[] args) {
        try {
            // Trying to load a class that doesn't exist
            Class.forName("com.example.NonExistentClass");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found! Please check if the class name is correct.");
            e.printStackTrace();
        }
    }
}