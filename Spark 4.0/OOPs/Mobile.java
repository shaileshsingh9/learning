class Notification{
    void send(){
        System.out.println("Sending notification....");
    }
}
class EmailNotification extends Notification{
    @Override
    void send(){
        System.out.println("EMail notification....");
    }
}
class WatsappNotification extends Notification{
    @Override
    void send(){
        System.out.println("Watsapp notification....");
    }
}
class SMSNotification extends Notification{
    @Override
    void send(){
        System.out.println("SMS notification ....");
    }
}
public class Mobile {
    public static void main(String[] args) {
        Notification notification;

        notification=new EmailNotification();
        notification.send();
        notification=new SMSNotification();
        notification.send();
        notification=new WatsappNotification();
        notification.send();


    }
}
