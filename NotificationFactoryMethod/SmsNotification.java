package NotificationFactoryMethod;

public class SmsNotification implements Notification{
  public void notifyUsers(){
      System.out.println("Sms Notification");
  }
}
