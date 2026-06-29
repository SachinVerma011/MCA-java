class MyThreads implements Runnable{
    public void run(){
        String name = "Bisanjeet Mahapatra";
        System.out.println(name);
    }
}
public class MultithreadingUsingImplements{
    public static void main (String[]args){

        MyThreads kb = new MyThreads();
        
         Thread tb = new Thread(kb);
        tb.start();
    }
}