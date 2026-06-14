package DecoratorPattern;

public class NottifierDecorator implements Nottifier {
      private Nottifier nottifier;
      public NottifierDecorator(Nottifier nottifier){
            this.nottifier=nottifier;
      }
      public String sendNotification(){
            return nottifier.sendNotification();
      }
     
}
