package DecoratorPattern;

public class SlackNotifierDecorator extends NottifierDecorator{
      private Nottifier nottifier;
      public SlackNotifierDecorator(Nottifier nottifier){
            super(nottifier);
            this.nottifier=nottifier;
      }
      public String sendNotification(){
            return nottifier.sendNotification()+" via , Slack Notifier";
      }
}
