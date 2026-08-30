public class Test {
    static void main(String[] args) {
        ATM atm=new ATM( "Mukesh", 12000);
        atm.showBal();
//        atm.balance=22;   no access when we use private no value change.
        atm.showBal();
    }
}
