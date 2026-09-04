class Bank{
int accountNum;
String accountHolder;
double balance;

Bank(){
this(110,"Singh", 1200);
}

Bank(int accountNum){
this(accountNum,"Singh",1200);

}
Bank(int accountNum, String accountHolder){
this(accountNum, accountHolder,1200);
}
Bank(int accountNum, String accountHolder, double balance){
this.accountNum=accountNum;
this.accountHolder=accountHolder;
this.balance=balance;
}
void deposit(double amount){
balance=balance+amount;
System.out.println("Deposit : "+amount);
System.out.println("balance : "+balance);

}
void withdraw(double amount){
if(amount <= balance){
balance = balance-amount;
System.out.println("Withdraw : "+amount);
System.out.println("Balance : "+balance);
}
else{
System.out.println("Insuffient balance");
}

}
void showDetails(){
System.out.println("AccountNumber : "+accountNum);
System.out.println("AccountHolder : "+accountHolder);
System.out.println("Balance : "+balance);
}

}



public class r5{
public static void main(String[] args){

Bank b1=new Bank();
Bank b2=new Bank(111);
Bank b3=new Bank(112, "Awanish");
Bank b4=new Bank(113, "Satyam", 500);


b1.showDetails();
b2.showDetails();
b3.showDetails();
b4.showDetails();

System.out.println("................Tran............");

b4.deposit(1000);
b4.withdraw(300);
b4.showDetails();


}

}