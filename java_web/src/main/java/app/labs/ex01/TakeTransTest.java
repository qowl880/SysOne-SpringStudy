package app.labs.ex01;

public class TakeTransTest {

   public static void main(String[] args) {
      Passanger pass1 = new PassangerImpl(1, "승객1", 10000);
      Passanger pass2 = new PassangerImpl(2, "승객2", 10000);
      Transportation bus100 = new Bus(100);
      Transportation bus200 = new Bus(200);
    
      Transportation subway1 = new Subway(1,0,0);
      Transportation subway2 = new Subway(2,0,0);
      
      
      bus100.getIn(pass1);
      bus100.getIn(pass2);

      bus100.getOut(pass1);
      bus100.getOut(pass2);
   
      bus200.getIn(pass1);
      bus200.getOut(pass1);
      
     
      
   }
}
