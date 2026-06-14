package DecoratorPattern;

public class testClass {
      public static void main(String[] args) {
            Nottifier nottifier = new EmailNottifier();
            System.out.println(nottifier.sendNotification());
            nottifier = new SMSNotifierDecorator(nottifier);
            System.out.println(nottifier.sendNotification());
            nottifier = new SlackNotifierDecorator(nottifier);
            System.out.println(nottifier.sendNotification());
      }
}
