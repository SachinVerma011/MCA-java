// Class to calculate squares
class SquareCalculator implements Runnable {
    @Override
    public void run() {
        System.out.println("Squares:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Square of " + i + " = " + (i * i));
           try { 
           Thread.sleep(100); // small delay to simulate processing
        }
            catch (InterruptedException e) {
               e.printStackTrace();
           }
        }
    }
}

// Class to calculate cubes
class CubeCalculator implements Runnable {
    @Override
    public void run() {
        System.out.println("Cubes:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Cube of " + i + " = " + (i * i * i));
            try {
                Thread.sleep(100); // small delay to simulate processing
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class MathLab25 {
    public static void main(String[] args) {
        // Create Runnable instances
        Runnable squareTask = new SquareCalculator();
        Runnable cubeTask = new CubeCalculator();

        // Create threads
        Thread t1 = new Thread(squareTask);
        Thread t2 = new Thread(cubeTask);

        // Start threads
        t1.start();
        t2.start();
    }
}
