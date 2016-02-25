package Week12;
/**
 * Created by Shiva on 11/18/2015.
 */
public class SmartPhone  implements Iphone,Android,BlackBerry,Nokia{



    public static void main(String args[]){
        SmartPhone mysmartPhone=new SmartPhone ();
        mysmartPhone.RecordVideo ();
        mysmartPhone.TakePhoto ();
        mysmartPhone.Playgame ();
        mysmartPhone.SendMessage ();
    }

    @Override
    public void RecordVideo() {
        System.out.println ("Andriod Interface Feature");
    }

    @Override
    public void TakePhoto() {
        System.out.println ("Iphone Interface Feature");
    }

    @Override
    public void Playgame() {
        System.out.println ("Nokia Interface Feature");
    }

    @Override
    public void SendMessage() {
        System.out.println ("BlackBerry Interface Feature");
    }
}
 interface Iphone {
     public String name="Iphone";
    public void TakePhoto();

}

interface Android {
    public void RecordVideo();

}

interface BlackBerry {
    public void SendMessage();

}

interface Nokia {
    public void Playgame();

}

