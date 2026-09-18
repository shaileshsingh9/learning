class BankAccount {

    private int balance = 1000;

    synchronized void withdraw(int amount) {

        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " withdrawing: " + amount);

            balance = balance - amount;

            System.out.println("Remaining balance: " + balance);

        } else {
            System.out.println(
                    Thread.currentThread().getName() + " - Insufficient balance");
        }
    }

    int getBalance() {
        return balance;
    }
}

public class SynchronizedBank {

    public static void main(String[] args) throws InterruptedException {

        BankAccount account = new BankAccount();

        Thread t1 = new Thread(() -> account.withdraw(700), "Thread-1");

        Thread t2 = new Thread(
                () -> account.withdraw(500), "Thread-2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Balance: " + account.getBalance());
    }
}