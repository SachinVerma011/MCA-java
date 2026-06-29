import java.io.*;  
public class BufferedReader27 {  
    public static void main(String args[])throws Exception{    
          FileReader fr=new FileReader("Sachin.txt");    
          BufferedReader br=new BufferedReader(fr);    
  
          int i;    
          while((i=br.read())!=-1){  
          System.out.print((char)i);  
          }  
          br.close();    
          fr.close();    
    }    
}  