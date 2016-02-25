package Week11.CompositionI;

/**
 * Created by Shiva on 11/11/2015.
 */
public class Maruti extends Car{

    //Maruti extends Car and thus inherits all methods from Car (except final and static)

    //Maruti can also define all its specific functionality

    public void MarutiStartDemo(){

        Engine MarutiEngine = new Engine();

        MarutiEngine.start();

    }

}