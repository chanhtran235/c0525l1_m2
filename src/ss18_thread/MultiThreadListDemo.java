package ss18_thread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultiThreadListDemo {
    public static void main(String[] args) throws InterruptedException {
        List<String> data = Arrays.asList(
                "A", "B", "C", "D", "E", "F", "G", "H", "I", "J"
        );

        List<Thread> threadList = new ArrayList<>();

        for (String s : data) {
            Thread thread = new Thread(() -> {
                // giả lập xử lý nặng
                System.out.println(Thread.currentThread().getName() + " xử lý: " + s);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("lỗi thread");
                }
            });
            threadList.add(thread);
            thread.start();
        }

        // chờ tất cả thread xong
        for (Thread t : threadList) {
            t.join();
        }

        System.out.println("Tất cả xong!");
    }
}