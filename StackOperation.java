import java.util.Scanner;
class Stack {
    int top;
    int maxSize;
    int[] stackArray;

    // Constructor
    Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1; // Stack initially empty
    }

    // Push operation
    void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack Overflow " + value);
        } else {
            top =top+1;
            stackArray[top] = value;
            // stackArray[++top] = value;
            System.out.println(value + " pushed into stack.");
        }
    }

    // Pop operation
    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println(stackArray[top--] + " popped from stack");
        }
    }

    // Display stack elements
    void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Stack elements: ");
            for (int i = top; i >= 0; i--) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }
    }
}

public class StackOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of stack: ");
        int size = sc.nextInt();
        
        Stack stack = new Stack(size);

        while (true) {
          
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int value = sc.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.display();
                    break;
                case 4:
                    System.out.println("Exiting program");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}

