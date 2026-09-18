class Addition{
    int sum=0;
   synchronized public void add(){
        sum=sum+1;
    }
}

class MyThread5 extends Thread{

    Addition add;
    MyThread5 (Addition add){
        this.add=add;
    }

    @Override
    public void run(){

        for (int i=1; i<=1000; i++){
         add.add();
        }
    }


}

class MyThread6 extends Thread{

    Addition add;
    MyThread6 (Addition add){
        this.add=add;
    }

    @Override
    public void run(){

        for (int i=1; i<=1000; i++){
            add.add();
        }
    }


}


public class SynchronizationProblem {

    static void main(String[] args) throws InterruptedException {
      Addition addition=new Addition();
      MyThread5 t1=new MyThread5(addition);
      MyThread6 t2=new MyThread6(addition);

      t1.start();
      t2.start();

      t1.join();
      t2.join();


      System.out.println("Final sum: "+addition.sum);

    }
}
