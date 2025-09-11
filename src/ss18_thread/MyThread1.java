package ss18_thread;

public class MyThread1 extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() +" done");
    }
}
