package Week12.Hw5;

/**
 * Created by Shiva on 11/18/2015.
 */
public class InterfaceInheritance {

      public static void main(String[] args) {
        Car c= new BMW();
        c.start ();
        c.stop ();
          System.out.println ("----------------------------");
          Car l=new Lexus ();
          l.start ();
          l.stop ();
         // l.speed();

          System.out.println ("----------------------------");
          Lexus lex= new Lexus ();
          lex.stop ();
          lex.start ();
          lex.speed();

    }

}


    interface Vehicle {
        void start();
    }

    interface Car extends Vehicle {
        void stop();
    }



   class BMW implements Car {


        @Override
        public void stop() {
            System.out.println (" BMW Car Stopped");
        }

        @Override
        public void start() {
            System.out.println (" BMW Car Started");
        }
    }

   class Lexus implements  Car{

       @Override
       public void stop() {
           System.out.println (" Lexus Car Stopped");
       }

       @Override
       public void start() {
           System.out.println (" Lexus Car Stopped");
       }

       public void speed(){
           System.out.println (" Lexus Car Speed 250mph");
       }
   }

