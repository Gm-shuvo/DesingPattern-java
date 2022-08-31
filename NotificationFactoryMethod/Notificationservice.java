package NotificationFactoryMethod;

public class Notificationservice {
  public static void main(String[] args) {
    NotificationFatory Notify = new NotificationFatory();
    Notify.getNotification("sms").notifyUsers();;
  }
}
