public class ATM {
     private String AccountHolderNAme;
    private double balance;

    ATM(String name, double bal){
        this.AccountHolderNAme=name;
        this.balance=bal;
    }
    public static void main(String[] args){
        ATM atm=new ATM( "Shailesh", 10000);
        atm.showBal();
    }

    void showBal(){
        System.out.println("Your Current Balance is "+balance);
    }
}
