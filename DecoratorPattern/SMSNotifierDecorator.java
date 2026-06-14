package DecoratorPattern;

public class SMSNotifierDecorator extends NottifierDecorator{
      private Nottifier nottifier;
      public SMSNotifierDecorator(Nottifier nottifier){
            super(nottifier);
            this.nottifier=nottifier;
      }
      public String sendNotification(){
            return nottifier.sendNotification()+" via , SMS Notifier";
      }
}
