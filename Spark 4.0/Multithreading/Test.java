class MyThread extends Thread {

    @Override
    public void run() {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread completed");
    }
}

public class Test {

    public static void main(String[] args) {

        MyThread t = new MyThread();

        System.out.println("Before: " + t.isAlive());

        t.start();

        System.out.println("After start: " + t.isAlive());

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("After 1 sec: " + t.isAlive());
    }
}