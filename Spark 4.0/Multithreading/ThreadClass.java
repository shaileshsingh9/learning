class MyThread1 extends Thread
{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}

public class ThreadClass {
    static void main(String[] args) {
        //start()
        //run()
        //getname()
        //setname()
        //setPriority()

        System.out.println(Thread.currentThread().getName());
        Thread t=Thread.currentThread();
        t.setName("my thread");
        System.out.println(Thread.currentThread().getName());
        MyThread1 t1=new MyThread1();
        t1.start();
    }
}
