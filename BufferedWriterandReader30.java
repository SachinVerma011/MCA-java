import java.io.*;  
public class BufferedWriterandReader30 {  
public static void main(String[] args) throws Exception
    {     
    FileWriter writer = new FileWriter("Annu.txt");  
    BufferedWriter buffer = new BufferedWriter(writer);  
    buffer.write("How are you Annu31
    31");  
    buffer.close();  
    writer.close();
    System.out.println("file Written Successfully");  
    FileReader fr=new FileReader("Annu.txt");    
          BufferedReader br=new BufferedReader(fr);    
  
          int i;    
          while((i=br.read())!=-1){  
          System.out.print((char)i);  
          }  
          br.close();    
         fr.close(); 
    }  
}  