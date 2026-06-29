public class OverlappingQueues {
    private int[] arr;
    private int front0, rear0; 
    private int front1, rear1; 
    private int size;

    public OverlappingQueues(int N) {
        arr = new int[N];
        size = N;
        front0 = -1;
        rear0 = -1;
        front1 = N;
        rear1 = N;
    }

    public boolean IsEmpty(int i) {
        if (i == 0) {
            return front0 == -1;
        } else if (i == 1) {
            return front1 == size;
        }
        return true;
    }

    public boolean IsFull(int i) {
        if (i == 0) {
            return rear0 == size - 1 && front1 == rear0 + 1;
        } else if (i == 1) {
            return rear1 == 0 && front0 == rear1 - 1;
        }
        return true;
    }

    public boolean Insert(int i, int value) {
        if (IsFull(i)) {
            System.out.println("Queue " + i + " is full.");
            return false;
        }

        if (i == 0) {
            if (front0 == -1) {
                front0 = 0;
            }
            rear0++;
            arr[rear0] = value;
        } else if (i == 1) {
            if (front1 == size) {
                front1 = size - 1;
            }
            rear1--;
            arr[rear1] = value;
        }
        return true;
    }

    public Integer Delete(int i) {
        if (IsEmpty(i)) {
            System.out.println("Queue " + i + " is empty.");
            return null;
        }

        int value;
        if (i == 0) {
            value = arr[front0];
            if (front0 == rear0) {
                front0 = -1;
                rear0 = -1;
            } else {
                front0++;
            }
        } else if (i == 1) {
            value = arr[front1];
            if (front1 == rear1) {
                front1 = size;
                rear1 = size;
            } else {
                front1--;
            }
        } else {
            return null;
        }
        return value;
    }

    public void printArray() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        OverlappingQueues queues = new OverlappingQueues(5);
        queues.Insert(0, 10);
        queues.Insert(0, 20);
        queues.Insert(1, 30);
        queues.Insert(1, 40);
        queues.printArray(); // Output     -: 10 20 0 40 30

        System.out.println("Deleted from queue 0: " + queues.Delete(0)); // 10
        System.out.println("Deleted from queue 1: " + queues.Delete(1)); // 30
        queues.printArray(); // Output-:   0 20 0 40 0
    }
}
