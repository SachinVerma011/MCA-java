import java.io.FileReader;  
public class FileReaderCount28 {  
    public static void main(String args[]) throws Exception{    
          FileReader fr=new FileReader("Sachin.txt");    
          int i;
          int sc=0;
          int cc=0;
          int w=0;
          int s=0;    
          while((i=fr.read())!=-1)   
          { 
          System.out.print((char)i); 
          if((char)i>=97&&(char)i<=122)
          sc++;
          if((char)i>=65&&(char)i<=90)
          cc++;
          if((char)i==32)
          {
          s++;
          }
          w=s+1;
          }
          System.out.println(" small characters="+sc+" "+"capital characters="+cc+ " "+"words="+w+" "+"spaces="+s);
          fr.close();    
    }    
}   