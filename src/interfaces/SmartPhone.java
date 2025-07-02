package interfaces;

import javax.crypto.spec.PSource;
import java.sql.SQLOutput;

public class SmartPhone implements Camera, MusicPlayer, Phone{
    @Override
    public void takePhoto() {
        System.out.println("Clicked!");
    }

    @Override
    public void deletePhoto() {
        System.out.println("Deleted!");
    }

    @Override
    public void playSong() {
        System.out.println("Playing");
    }

    @Override
    public void nextSong() {
        System.out.println("Next Playing");
    }

    @Override
    public String number(String num) {
        System.out.println(num);
        return num;
    }

    @Override
    public void makeCall() {
        System.out.println("Calling,,,,,");
    }
}
