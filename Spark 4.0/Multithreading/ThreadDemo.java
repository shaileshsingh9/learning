class Mythread extends Thread{

    @Override
    public void start(){
        System.out.println(" Mythread ");
    }
}

public class ThreadDemo {

    static void main(String[] args) {
        Mythread t=new Mythread();
        t.start();

    }
}
