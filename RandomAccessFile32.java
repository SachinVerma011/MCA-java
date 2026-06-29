import java.io.*;

public class RandomAccessFile32 {
   public static void main(String[] args) {
      try {
         RandomAccessFile raf = new RandomAccessFile("jatin.txt", "rw");

         raf.writeUTF("Hello, Welcome in RandomAccessFile!");
         System.out.println("Data written to file.");

         raf.close(); // Closes the file properly
         System.out.println("File closed successfully.");
      } catch (IOException e) {
         e.printStackTrace();
      }
   }
}