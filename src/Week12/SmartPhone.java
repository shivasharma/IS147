package Week12;

interface Iphone {
    String name = "Iphone";

    void TakePhoto();

}

interface Android {
    void RecordVideo();

}

interface BlackBerry {
    void SendMessage();

}

interface Nokia {
    void Playgame();

}

public class SmartPhone implements Iphone, Android, BlackBerry, Nokia {


    public static void main(String[] args) {
        SmartPhone mysmartPhone = new SmartPhone();
        mysmartPhone.RecordVideo();
        mysmartPhone.TakePhoto();
        mysmartPhone.Playgame();
        mysmartPhone.SendMessage();
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

