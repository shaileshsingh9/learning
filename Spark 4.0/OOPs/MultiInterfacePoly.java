interface Payment{
    void pay();
}
class UPI implements Payment{
    @Override
  public void pay(){
      System.out.println("Payment using UPI..");

    }
}
class CreditCard implements Payment{
    @Override
    public void pay(){
        System.out.println("Payment using credit card ");
    }
}
class Cash implements Payment{
    @Override
    public void pay(){
        System.out.println("Payment using Cash..");
    }
}

public class MultiInterfacePoly {

    static void makePayment(Payment payment){
        payment.pay();
    }

    public static void main(String[] args) {

// Different type se
//      Payment payment;
//
//      payment=new UPI();
//      payment.pay();
//
//      payment=new CreditCard();
//      payment.pay();
//
//      payment=new Cash();
//      payment.pay();

       // different type se method bana ke call karna
        makePayment(new UPI());
        makePayment(new Cash());
        makePayment(new CreditCard());


    }
}
