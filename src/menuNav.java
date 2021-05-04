import java.awt.*;
import java.awt.image.BufferedImage;

public class menuNav {

    public static void Menu() throws InterruptedException {
        String format = "[Sisteme giriş yapılıyor...]" + "%d%%\r";
        for (int i = 0; i <= 100; i++) {
            System.out.printf(format, i);
            Thread.sleep(25);
        }


        System.out.format("---------------------------------------------------%n");
        System.out.format("| Game Rental Uygulamasına Hoşgeldiniz  - Lütfen Giriş Yapınız  |%n");
        System.out.format("---------------------------------------------------%n");


    }

}