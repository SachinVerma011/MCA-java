import java.io.*;



public class RandomAccessFile31 {
   public static void main(String[] args) {
      try (RandomAccessFile raf = new RandomAccessFile("jatin.txt", "rw")) {
         //raf.writeBytes("1234567890");

         raf.seek(15); // Move file pointer to byte index 5
         int data = raf.read();
         System.out.println("Byte at position 5: " + data + " (char: " + (char) data + ")");
      } catch (IOException e) {
         e.printStackTrace();
      }
   }
}