package DecoratorPattern;

public class EmailNottifier implements Nottifier {

      @Override
      public String sendNotification() {
            return " Email Notification : ";
      }
      
}
