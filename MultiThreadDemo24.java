// Thread class 1
class ThreadOne extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("ThreadOne: " + i);
            try {
                Thread.sleep(1); // Sleep for 100ms to simulate concurrency
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Thread class 2
class ThreadTwo extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("ThreadTwo: " + i);
            try {
                Thread.sleep(1); // Sleep for 100ms to simulate concurrency
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class MultiThreadDemo24 {
    public static void main(String[] args) {
        ThreadOne t1 = new ThreadOne();
        ThreadTwo t2 = new ThreadTwo();

        // Start both threads
        t1.start();
        t2.start();
    }
}
