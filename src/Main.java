import java.util.Date;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 09/11/2020
 */

public class Main {

    public static void main(String[] args) {

        /*Apple a = new Apple();
        a.stykpris = 2;
        a.holdbarhed = new Date(1608768000);
        a.smidUd();
        a.moden = true;
        a.coolDown();

        Peas p = new Peas();
        p.stykpris = 0.1;
        p.holdbarhed = new Date(1608768000);
        p.freeze();

        Banana b = new Banana();
        b.stykpris = 1.5;
        b.holdbarhed = new Date(1608768000);
        b.moden = true;
        b.coolDown();

        Carrot c = new Carrot();
        c.stykpris = 2;
        c.holdbarhed = new Date(1608768000);
        c.freeze();

        Flower f = new Flower();
        f.stykpris = 10;
        System.out.println(f.sort + " " + f.type);
        f.wilt();*/

        Lager lager = new Lager();
        lager.fyldOp(10, 10, 5, 5);
        lager.visVarer();
        System.out.println("Antal varer: " + lager.antalVarer());
        System.out.println("Antal Æbler: " + lager.antalÆbler());
        System.out.println("Antal Flower: " + lager.antalObjekter( new Flower() ));

    }

}
