package ss18_thread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        StringBuilder strings = new StringBuilder("begin: ");// bất đồng bộ
        Thread thread1 = new Thread("thread1") {
            @Override
            public void run() {
                for (int i = 0; i <1000 ; i++) {
                    strings.append(1);
                }

                System.out.println(this.getName() + ": done");
            }
        };
        Thread thread2 = new Thread("thread2") {
            @Override
            public void run() {
                for (int i = 0; i <1000 ; i++) {
                    strings.append("-a-");
                }
                System.out.println(this.getName() + ": done");
            }
        };

        Runnable runnable = new Runnable() {
            @Override
            public void run() {

            }
        };
        Thread thread = new Thread(runnable);



        thread1.start();
//        thread1.join();
        thread2.start();
//        thread1.join();
        thread2.join();
        System.out.println("-------" +strings.length()+  "---------");
        System.out.println(strings);



    }
}
