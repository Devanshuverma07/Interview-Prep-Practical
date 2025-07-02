package interfaces;

public class Main {
    public static void main(String... args){
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.number("9910773304");
        smartPhone.makeCall();
        smartPhone.takePhoto();
        smartPhone.deletePhoto();
        smartPhone.playSong();
        smartPhone.nextSong();
    }
}
