class BankAccount{
int accountNumber;
String accountHolder;
double balance;



BankAccount(int accountNumber, String accountHolder, double balance){
this.accountNumber=accountNumber;
this.accountHolder=accountHolder;
this.balance=balance;

}


void deposit(double amount){
balance=balance+amount;
System.out.println("deposit "+amount);
System.out.println("balance "+balance);

}
void withdraw(double amount){
if(amount <= balance){
balance=balance - amount;
System.out.println("Withdraw : "+amount);
System.out.println("balance :"+balance);
}
else{
System.out.println("Insuffient  balance ");
}

}
void showBalance(){
System.out.println("balance "+balance);
}

}

public class r4{
public static void main(String[] args){
  
 BankAccount b=new BankAccount(101,"Shailesh singh",15000);
 BankAccount b1=new BankAccount(102,"Awanish barnwal",200000);
      
   b.deposit(500);

   b.withdraw(400);
System.out.println();
b.showBalance();

System.out.println("\n....................");

b1.deposit(200);
b1.withdraw(350);
System.out.println(); 
b1.showBalance();





}
}