


class MyClass implements Runnable {
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread() + " Value " + i);
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

public class ThreadsExample {
    public static void main(String[] args) {
        Thread b = new Thread(new MyClass());
        b.start();

        Thread t = new Thread(new MyClass());
        t.start();
    }

}
