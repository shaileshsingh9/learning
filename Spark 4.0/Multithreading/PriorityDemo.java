
class MyThread2 extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getPriority());
    }
}

public class PriorityDemo {
    static void main(String[] args) {
        MyThread2 t3=new MyThread2();
        t3.setName("Thread t3");
        t3.setPriority(Thread.MIN_PRIORITY);


        MyThread2 t4=new MyThread2();
        t4.setName("Thread t4");
        t4.setPriority(Thread.MAX_PRIORITY);

        t3.start();
        t4.start();

    }
}
