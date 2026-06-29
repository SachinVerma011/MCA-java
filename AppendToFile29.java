import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class AppendToFile29 {
   public static void main( String[] args ) {

      try {
         String data = " I hope you enjoyed in file handling";
         File f1 = new File("Sachin.txt");
         if(!f1.exists()) {
            f1.createNewFile();
         }

         FileWriter fileWritter = new FileWriter(f1.getName(),true);
         BufferedWriter bw = new BufferedWriter(fileWritter);
         bw.write(data);
         bw.close();
         System.out.println("Content appended succuessfully");
      } catch(IOException e){
         e.printStackTrace();
      }
   }
}