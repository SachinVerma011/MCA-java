                                     //Multitheading unsing extends Thread and implements Runnnable
                                     
class MyThreads extends Thread{
    public void run(){
        int a =10;
        int b=20;
        int c=10+20;
        for(int i=1; i<=5; i++){
        System.out.println("Sum :"+c);
        }
    }
}
class YourThreads implements Runnable{
    public void run(){
        String name = "VITian";
        System.out.println(name);
    }
}
public class MultiThUsingThredandRunnable{
    public static void main(String[]args){
        MyThreads kb=new MyThreads();
        kb.start();

        YourThreads mb = new YourThreads();
         Thread tb =new Thread(mb);
         tb.start();
    }
}
