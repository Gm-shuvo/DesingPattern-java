package NotificationFactoryMethod;

public class EmailNotification implements Notification{
    public void notifyUsers() {
      System.out.println("Email Notifacation");
    }
}
