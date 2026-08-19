public class BankAccount {
    private String accountHolder;
    private double balance;

    BankAccount(String accountHolder, double balance){
        this.accountHolder=accountHolder;
        if (balance >= 0){
            this.balance=balance;
        }
        else {
            System.out.println("Your balance is  less 0 rupees ");
        }

    }
    void deposit(double Amount){
          if (Amount > 0){
              balance=balance+Amount;
              System.out.println("Your deposit is " +Amount);
          }
          else{
              System.out.println("Invalid deposit amount ");
          }

    }
    void withdraw(double Amount){
        balance=balance-Amount;
        if(Amount > 0 && Amount <= balance){
            System.out.println("Withdraw amount is "+Amount);
        }
        else {
            System.out.println("Insuffient balance");
        }

    }

    double getBalance(){
        return balance;
    }

    static void main(String[] args) {
        BankAccount b=new BankAccount("shailesh singh", 1100);
        b.deposit(400);
        b.withdraw(550);
        System.out.println(b.getBalance());
    }
}
