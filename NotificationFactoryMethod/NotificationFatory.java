package NotificationFactoryMethod;

public class NotificationFatory {
  public Notification getNotification(String notifyType){
    if (notifyType == null) return null;
    if (notifyType.equalsIgnoreCase("EMAIL")){
      return new EmailNotification();
    }
    if (notifyType.equalsIgnoreCase("SMS")){
      return new SmsNotification();
    }
    if (notifyType.equalsIgnoreCase("PUSH")) {
      return new PushNotification();
    }
    return null;
  }

}
