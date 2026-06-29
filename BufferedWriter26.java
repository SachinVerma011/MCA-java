import java.io.*;  
public class BufferedWriter26 {  
public static void main(String[] args) throws Exception
    {     
    FileWriter writer = new FileWriter("Sachin.txt");  
    BufferedWriter buffer = new BufferedWriter(writer);  
    buffer.write("welcome in file handling");  
    buffer.close();  
    System.out.println("file Written Successfully");  
    }  
} 