class MyThreads extends Thread{
    public void run(){
        String para = "I am VITian";
        System.out.println(para);
    }

}
public class MultithreadingUsingExtends{
    public static void main (String[]args){
        MyThreads kb = new MyThreads();
        kb.start();

    }
}